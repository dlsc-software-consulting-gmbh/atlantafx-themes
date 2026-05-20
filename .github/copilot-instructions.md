# Copilot Instructions

## Build & Test

```sh
mvn compile                    # compile all SCSS → CSS (also unpacks AtlantaFX SASS sources)
mvn compile -Pwatch            # watch mode: recompile on SCSS changes
mvn test                       # compile + run all unit tests
mvn test -Denforcer.skip=true  # skip Maven version enforcement (needed if local Maven < 3.9.10)

# Run a single test method
mvn test -Dtest="ThemeDarkModeTest#cssFileExists" -Denforcer.skip=true
```

**Important:** When adding a new theme, run `mvn compile` before `mvn test`. The SASS compiler writes CSS to `src/main/resources/` during the `compile` phase, which runs *after* Maven's resource-copy phase. The first `mvn test` would fail the `cssFileExists` check for the new file; the second run passes because the CSS is already in place.

Compiled CSS is written to `src/main/resources/com/dlsc/atlantafx/themes/`.

## Architecture

The project has two layers that must stay in sync for each theme.

### Layer 1 — SCSS → CSS (build time)

Two Maven phases:

1. **`generate-resources`** — `maven-dependency-plugin` unpacks the `atlantafx-styles` JAR into `target/atlantafx/styles/`. These upstream SASS sources are the base every theme overrides.
2. **`compile`** — `sass-cli-maven-plugin` compiles each `src/<theme>.scss` entry point into `src/main/resources/com/dlsc/atlantafx/themes/<theme>.css`. Each entry is registered as an `<arg>` in `pom.xml`.

`target/` must exist before SCSS `@forward`/`@use` paths resolve. Always run `mvn compile` at least once before working in watch mode.

### Layer 2 — Java Theme interface (runtime)

Each theme has a corresponding Java class in `src/main/java/com/dlsc/atlantafx/themes/` that implements `atlantafx.base.theme.Theme`. This is what JavaFX applications consume:

```java
Application.setUserAgentStylesheet(new NavyDark().getUserAgentStylesheet());
```

The module system (`module-info.java`) wires everything together:
- `provides atlantafx.base.theme.Theme with ...` — lists every Theme implementation so `ServiceLoader` can discover them
- `uses atlantafx.base.theme.Theme` — required for the test suite to call `ServiceLoader.load(Theme.class, ...)`

## Key Conventions

### Adding a new theme — checklist

Every new theme requires changes in **four places**:

1. **`src/<name>.scss`** — SCSS source (three-layer override pattern, see below)
2. **`pom.xml`** — add `<arg>${scss.inputDir}/<name>.scss:${css.outputDir}/<name>.css</arg>` inside the `sass-cli-maven-plugin` args block
3. **`src/main/java/com/dlsc/atlantafx/themes/<ClassName>.java`** — Java Theme implementation
4. **`src/main/java/module-info.java`** — add the class to the `provides` clause

### SCSS three-layer override pattern

Every SCSS file follows this exact order (see any existing theme as a reference):

```scss
// 1. Raw color palette (10-step scales, 0 = lightest, 9 = darkest)
@forward "../target/atlantafx/styles/settings/color-scale" with (
  $dark: ..., $light: ...,
  $base-0: ... $base-9: ...,
  $accent-0: ... $accent-9: ...,
  // success, warning, danger scales
);

@use "../target/atlantafx/styles/settings/color-scale" as scale;

// 2. Semantic color tokens mapped from the scale
@forward "../target/atlantafx/styles/settings/color-vars" with (
  $fg-default: scale.$dark,
  $canvas-default: scale.$light,  // or scale.$base-8 for dark themes
  // ...
);

// 3. Mode flag
@forward "../target/atlantafx/styles/settings/config" with (
  $darkMode: true   // or false
);

@use "../target/atlantafx/styles/general";
@use "../target/atlantafx/styles/components";
```

Never edit files under `target/` — they are wiped on every build.

### Color scale conventions

- Scale steps: `0` = lightest, `9` = darkest
- **Dark themes**: `canvas-default = base-8`, `canvas-inset = base-9`, `fg-default = base-1`
- **Light themes**: `canvas-default = $light` (white or custom), `canvas-inset = base-0`, `fg-default = $dark`
- `$dark` and `$light` are special variables for the extreme ends; `base-0…9` are the intermediate steps

### Java Theme class pattern

All implementations are `final`, have a no-arg constructor, and follow this structure:

```java
public final class MyTheme implements Theme {
    public String getName()                   { return "My Theme"; }
    public String getUserAgentStylesheet()    { return "/com/dlsc/atlantafx/themes/my-theme.css"; }
    public String getUserAgentStylesheetBSS() { return "/com/dlsc/atlantafx/themes/my-theme.bss"; }
    public boolean isDarkMode()               { return false; }
}
```

### Naming rules (enforced by tests)

- If `getName()` contains "dark" (case-insensitive) → `isDarkMode()` must return `true`
- If `getName()` contains "light" (case-insensitive) → `isDarkMode()` must return `false`
- `getUserAgentStylesheet()` must point to a CSS file that exists on the classpath

These are verified automatically by `ThemeDarkModeTest` on every `mvn test` run.

# Copilot Instructions

## Build

```sh
mvn compile          # compile SCSS → dist/navy-gold.css
mvn compile -Pwatch  # watch mode: recompile on SCSS changes
```

There are no tests or linters defined in this project.

## Architecture

The build has two Maven phases:

1. **`generate-resources`** — `maven-dependency-plugin` unpacks the `atlantafx-styles` JAR into `target/`. This makes the upstream AtlantaFX SASS sources available at `target/atlantafx/styles/`.
2. **`compile`** — `sass-cli-maven-plugin` compiles `src/sample-theme.scss` into `dist/sample-theme.css`.

The `target/` directory must exist (i.e., `mvn compile` must have been run at least once) before the SCSS paths resolve correctly.

## Key Conventions

### SCSS Customization Pattern

`src/sample-theme.scss` customizes AtlantaFX through three SASS layers in order:

1. **Color scale** (`settings/color-scale`) — raw palette values (`$base-*`, `$accent-*`, `$success-*`, `$warning-*`, `$danger-*`), overridden via `@forward ... with (...)`.
2. **Functional color variables** (`settings/color-vars`) — semantic tokens (`$fg-default`, `$canvas-default`, `$border-*`, etc.) mapped from the scale, also overridden via `@forward ... with (...)`.
3. **Global config** (`settings/config`) — flags like `$darkMode`, overridden via `@forward ... with (...)`.

After the `@forward` overrides, `@use` pulls in the upstream `general` and `components` stylesheets, which consume the overridden variables.

Always use the `@forward ... with (...)` pattern for variable overrides — do not edit files under `target/` directly (they are regenerated on every build).

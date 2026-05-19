package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ServiceLoader;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verifies invariants that every {@link Theme} implementation must satisfy:
 * <ul>
 *   <li>Themes with "dark" in their name must return {@code true} from {@link Theme#isDarkMode()}.</li>
 *   <li>Themes with "light" in their name must return {@code false} from {@link Theme#isDarkMode()}.</li>
 *   <li>The CSS file returned by {@link Theme#getUserAgentStylesheet()} must exist on the classpath.</li>
 * </ul>
 *
 * <p>Theme implementations are discovered via the Java module system's ServiceLoader
 * (declared through the {@code provides} directive in {@code module-info.java}).
 * When a new Theme implementation is added it must also be registered there.
 */
class ThemeDarkModeTest {

    static Stream<Theme> allThemes() {
        ServiceLoader<Theme> loader = ServiceLoader.load(
                Theme.class,
                ThemeDarkModeTest.class.getClassLoader());
        return StreamSupport.stream(loader.spliterator(), false);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("allThemes")
    void darkThemeNameImpliesDarkMode(Theme theme) {
        if (theme.getName().toLowerCase().contains("dark")) {
            assertTrue(theme.isDarkMode(),
                    "Theme '" + theme.getName() + "' has 'dark' in its name but isDarkMode() returned false");
        }
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("allThemes")
    void lightThemeNameImpliesLightMode(Theme theme) {
        if (theme.getName().toLowerCase().contains("light")) {
            assertFalse(theme.isDarkMode(),
                    "Theme '" + theme.getName() + "' has 'light' in its name but isDarkMode() returned true");
        }
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("allThemes")
    void cssFileExists(Theme theme) {
        String path = theme.getUserAgentStylesheet();
        assertNotNull(
                ThemeDarkModeTest.class.getResource(path),
                "CSS file not found on classpath: " + path + " (declared by theme '" + theme.getName() + "')");
    }
}

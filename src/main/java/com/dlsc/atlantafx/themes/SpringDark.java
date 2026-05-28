package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Spring Dark AtlantaFX theme.
 */
public final class SpringDark implements Theme {

    /**
     * Creates a new instance.
     */
    public SpringDark() {
    }

    public String getName() {
        return "Spring Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/spring-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/spring-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

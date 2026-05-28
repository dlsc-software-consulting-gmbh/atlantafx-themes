package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Spring Light AtlantaFX theme.
 */
public final class SpringLight implements Theme {

    /**
     * Creates a new instance.
     */
    public SpringLight() {
    }

    public String getName() {
        return "Spring Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/spring-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/spring-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

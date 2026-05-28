package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Blue Dark AtlantaFX theme.
 */
public final class BlueDark implements Theme {

    /**
     * Creates a new instance.
     */
    public BlueDark() {
    }

    public String getName() {
        return "Blue Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/blue-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/blue-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

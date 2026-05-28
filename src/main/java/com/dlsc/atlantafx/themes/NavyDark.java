package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Navy Dark AtlantaFX theme.
 */
public final class NavyDark implements Theme {

    /**
     * Creates a new instance.
     */
    public NavyDark() {
    }

    public String getName() {
        return "Navy Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/navy-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/navy-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}
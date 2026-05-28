package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Navy Light AtlantaFX theme.
 */
public final class NavyLight implements Theme {

    /**
     * Creates a new instance.
     */
    public NavyLight() {
    }

    public String getName() {
        return "Navy Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/navy-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/navy-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}
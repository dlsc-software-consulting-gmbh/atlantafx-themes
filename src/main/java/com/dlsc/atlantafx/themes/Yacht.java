package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Yacht AtlantaFX theme.
 */
public final class Yacht implements Theme {

    /**
     * Creates a new instance.
     */
    public Yacht() {
    }

    public String getName() {
        return "Yacht";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/yacht.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/yacht.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

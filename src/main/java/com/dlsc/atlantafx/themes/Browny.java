package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Browny AtlantaFX theme.
 */
public final class Browny implements Theme {

    /**
     * Creates a new instance.
     */
    public Browny() {
    }

    public String getName() {
        return "Browny";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/browny.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/browny.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}
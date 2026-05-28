package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Autumn AtlantaFX theme.
 */
public final class Autumn implements Theme {

    /**
     * Creates a new instance.
     */
    public Autumn() {
    }

    public String getName() {
        return "Autumn";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/autumn.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/autumn.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

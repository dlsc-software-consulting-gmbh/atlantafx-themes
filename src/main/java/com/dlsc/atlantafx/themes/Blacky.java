package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Blacky AtlantaFX theme.
 */
public final class Blacky implements Theme {

    /**
     * Creates a new instance.
     */
    public Blacky() {
    }

    public String getName() {
        return "Blacky";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/blacky.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/blacky.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

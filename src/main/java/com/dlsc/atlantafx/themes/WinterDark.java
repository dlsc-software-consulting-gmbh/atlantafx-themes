package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Winter Dark AtlantaFX theme.
 */
public final class WinterDark implements Theme {

    /**
     * Creates a new instance.
     */
    public WinterDark() {
    }

    public String getName() {
        return "Winter Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/winter-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/winter-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

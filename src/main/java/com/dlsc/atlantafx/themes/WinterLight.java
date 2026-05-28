package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Winter Light AtlantaFX theme.
 */
public final class WinterLight implements Theme {

    /**
     * Creates a new instance.
     */
    public WinterLight() {
    }

    public String getName() {
        return "Winter Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/winter-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/winter-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

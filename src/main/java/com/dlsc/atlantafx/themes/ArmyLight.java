package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Army Light AtlantaFX theme.
 */
public final class ArmyLight implements Theme {

    /**
     * Creates a new instance.
     */
    public ArmyLight() {
    }

    public String getName() {
        return "Army Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/army-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/army-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

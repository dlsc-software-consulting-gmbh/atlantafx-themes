package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class WinterLight implements Theme {

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

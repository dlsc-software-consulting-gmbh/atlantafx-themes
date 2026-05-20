package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class BlueLight implements Theme {

    public BlueLight() {
    }

    public String getName() {
        return "Blue Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/blue-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/blue-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

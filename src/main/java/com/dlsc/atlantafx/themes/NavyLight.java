package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class NavyLight implements Theme {

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
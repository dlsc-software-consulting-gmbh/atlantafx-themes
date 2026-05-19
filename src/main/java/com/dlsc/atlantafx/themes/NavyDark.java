package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class NavyDark implements Theme {

    public NavyDark() {
    }

    public String getName() {
        return "NavyLight Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/navy-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/navy-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}
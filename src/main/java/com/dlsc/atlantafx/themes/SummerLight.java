package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class SummerLight implements Theme {

    public SummerLight() {
    }

    public String getName() {
        return "Summer Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/summer-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/summer-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

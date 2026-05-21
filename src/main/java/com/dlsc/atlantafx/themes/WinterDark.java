package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class WinterDark implements Theme {

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

package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class FallLight implements Theme {

    public FallLight() {
    }

    public String getName() {
        return "Fall Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/fall-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/fall-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

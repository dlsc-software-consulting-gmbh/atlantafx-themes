package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class FallDark implements Theme {

    public FallDark() {
    }

    public String getName() {
        return "Fall Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/fall-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/fall-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

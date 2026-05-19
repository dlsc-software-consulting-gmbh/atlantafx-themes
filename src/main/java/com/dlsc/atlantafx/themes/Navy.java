package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class Navy implements Theme {

    public Navy() {
    }

    public String getName() {
        return "Navy";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/navy.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/navy.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}
package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class Seashell implements Theme {

    public Seashell() {
    }

    public String getName() {
        return "Seashell";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/seashell.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/seashell.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

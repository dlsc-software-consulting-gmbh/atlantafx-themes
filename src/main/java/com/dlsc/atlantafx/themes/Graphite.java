package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class Graphite implements Theme {

    public Graphite() {
    }

    public String getName() {
        return "Graphite";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/graphite.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/graphite.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

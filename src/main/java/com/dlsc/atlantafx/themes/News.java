package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class News implements Theme {

    public News() {
    }

    public String getName() {
        return "News";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/news.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/news.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}
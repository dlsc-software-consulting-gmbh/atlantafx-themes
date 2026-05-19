package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class GithubDarkTritanopia implements Theme {

    public GithubDarkTritanopia() {
    }

    public String getName() {
        return "GitHub Dark Tritanopia";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/github-dark-tritanopia.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/github-dark-tritanopia.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

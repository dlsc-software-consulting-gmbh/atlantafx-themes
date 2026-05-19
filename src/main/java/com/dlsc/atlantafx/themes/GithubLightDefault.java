package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class GithubLightDefault implements Theme {

    public GithubLightDefault() {
    }

    public String getName() {
        return "GitHub Light Default";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/github-light-default.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/github-light-default.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

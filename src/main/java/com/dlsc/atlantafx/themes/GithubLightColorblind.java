package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class GithubLightColorblind implements Theme {

    public GithubLightColorblind() {
    }

    public String getName() {
        return "GitHub Light Colorblind";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/github-light-colorblind.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/github-light-colorblind.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

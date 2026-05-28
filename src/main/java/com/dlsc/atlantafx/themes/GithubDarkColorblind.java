package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * GitHub Dark Colorblind AtlantaFX theme.
 */
public final class GithubDarkColorblind implements Theme {

    /**
     * Creates a new instance.
     */
    public GithubDarkColorblind() {
    }

    public String getName() {
        return "GitHub Dark Colorblind";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/github-dark-colorblind.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/github-dark-colorblind.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

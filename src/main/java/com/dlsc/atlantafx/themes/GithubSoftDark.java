package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * GitHub Soft Dark AtlantaFX theme.
 */
public final class GithubSoftDark implements Theme {

    /**
     * Creates a new instance.
     */
    public GithubSoftDark() {
    }

    public String getName() {
        return "GitHub Soft Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/github-soft-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/github-soft-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

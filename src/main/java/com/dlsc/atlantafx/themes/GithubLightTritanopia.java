package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * GitHub Light Tritanopia AtlantaFX theme.
 */
public final class GithubLightTritanopia implements Theme {

    /**
     * Creates a new instance.
     */
    public GithubLightTritanopia() {
    }

    public String getName() {
        return "GitHub Light Tritanopia";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/github-light-tritanopia.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/github-light-tritanopia.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

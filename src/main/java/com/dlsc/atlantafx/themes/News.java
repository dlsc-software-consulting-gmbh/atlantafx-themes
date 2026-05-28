package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * News AtlantaFX theme.
 */
public final class News implements Theme {

    /**
     * Creates a new instance.
     */
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
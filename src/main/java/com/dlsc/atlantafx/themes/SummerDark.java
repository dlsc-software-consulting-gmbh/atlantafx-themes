package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Summer Dark AtlantaFX theme.
 */
public final class SummerDark implements Theme {

    /**
     * Creates a new instance.
     */
    public SummerDark() {
    }

    public String getName() {
        return "Summer Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/summer-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/summer-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

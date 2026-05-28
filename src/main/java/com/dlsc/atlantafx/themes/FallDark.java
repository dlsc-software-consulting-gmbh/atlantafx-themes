package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

/**
 * Fall Dark AtlantaFX theme.
 */
public final class FallDark implements Theme {

    /**
     * Creates a new instance.
     */
    public FallDark() {
    }

    public String getName() {
        return "Fall Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/fall-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/fall-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

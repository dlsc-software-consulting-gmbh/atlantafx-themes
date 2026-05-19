package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class WipDark implements Theme {

    public WipDark() {
    }

    public String getName() {
        return "WIP Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/wip-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/wip-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

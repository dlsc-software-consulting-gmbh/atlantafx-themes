package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class WipLight implements Theme {

    public WipLight() {
    }

    public String getName() {
        return "WIP Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/wip-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/wip-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

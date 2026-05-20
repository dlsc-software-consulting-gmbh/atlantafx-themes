package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class ArmyDark implements Theme {

    public ArmyDark() {
    }

    public String getName() {
        return "Army Dark";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/army-dark.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/army-dark.bss";
    }

    public boolean isDarkMode() {
        return true;
    }
}

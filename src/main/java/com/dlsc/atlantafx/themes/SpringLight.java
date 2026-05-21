package com.dlsc.atlantafx.themes;

import atlantafx.base.theme.Theme;

public final class SpringLight implements Theme {

    public SpringLight() {
    }

    public String getName() {
        return "Spring Light";
    }

    public String getUserAgentStylesheet() {
        return "/com/dlsc/atlantafx/themes/spring-light.css";
    }

    public String getUserAgentStylesheetBSS() {
        return "/com/dlsc/atlantafx/themes/spring-light.bss";
    }

    public boolean isDarkMode() {
        return false;
    }
}

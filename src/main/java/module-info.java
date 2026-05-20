module com.dlsc.atlantafx.themes {
    requires atlantafx.base;
    requires atlantafx.styles;

    exports com.dlsc.atlantafx.themes;

    opens com.dlsc.atlantafx.themes;

    uses atlantafx.base.theme.Theme;

    provides atlantafx.base.theme.Theme with
        com.dlsc.atlantafx.themes.Browny,
        com.dlsc.atlantafx.themes.NavyDark,
        com.dlsc.atlantafx.themes.NavyLight,
        com.dlsc.atlantafx.themes.News,
        com.dlsc.atlantafx.themes.WipDark,
        com.dlsc.atlantafx.themes.WipLight,
        com.dlsc.atlantafx.themes.GithubSoftDark,
        com.dlsc.atlantafx.themes.GithubLightDefault,
        com.dlsc.atlantafx.themes.GithubDarkColorblind,
        com.dlsc.atlantafx.themes.GithubLightColorblind,
        com.dlsc.atlantafx.themes.GithubDarkTritanopia,
        com.dlsc.atlantafx.themes.GithubLightTritanopia,
        com.dlsc.atlantafx.themes.Graphite,
        com.dlsc.atlantafx.themes.Yacht,
        com.dlsc.atlantafx.themes.Seashell,
        com.dlsc.atlantafx.themes.Autumn,
        com.dlsc.atlantafx.themes.Blacky,
        com.dlsc.atlantafx.themes.ArmyDark,
        com.dlsc.atlantafx.themes.ArmyLight;
}
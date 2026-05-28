/**
 * Module containing custom AtlantaFX themes.
 */
module com.dlsc.atlantafx.themes {
    requires atlantafx.base;

    exports com.dlsc.atlantafx.themes;

    opens com.dlsc.atlantafx.themes;

    uses atlantafx.base.theme.Theme;

    provides atlantafx.base.theme.Theme with
            com.dlsc.atlantafx.themes.Browny,
            com.dlsc.atlantafx.themes.NavyDark,
            com.dlsc.atlantafx.themes.NavyLight,
            com.dlsc.atlantafx.themes.News,
            com.dlsc.atlantafx.themes.BlueDark,
            com.dlsc.atlantafx.themes.BlueLight,
            com.dlsc.atlantafx.themes.GithubSoftDark,
            com.dlsc.atlantafx.themes.GithubLightDefault,
            com.dlsc.atlantafx.themes.GithubDarkColorblind,
            com.dlsc.atlantafx.themes.GithubLightColorblind,
            com.dlsc.atlantafx.themes.GithubDarkTritanopia,
            com.dlsc.atlantafx.themes.GithubLightTritanopia,
            com.dlsc.atlantafx.themes.Yacht,
            com.dlsc.atlantafx.themes.Autumn,
            com.dlsc.atlantafx.themes.Blacky,
            com.dlsc.atlantafx.themes.ArmyDark,
            com.dlsc.atlantafx.themes.ArmyLight,
            com.dlsc.atlantafx.themes.FallDark,
            com.dlsc.atlantafx.themes.FallLight,
            com.dlsc.atlantafx.themes.SpringDark,
            com.dlsc.atlantafx.themes.SpringLight,
            com.dlsc.atlantafx.themes.SummerDark,
            com.dlsc.atlantafx.themes.SummerLight,
            com.dlsc.atlantafx.themes.WinterDark,
            com.dlsc.atlantafx.themes.WinterLight;
}
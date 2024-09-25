package utils;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;


public class SettingsTestData {
    private static final ISettingsFile environment = new JsonSettingsFile("settings.json");

    public static String getHost() {
        return environment.getValue("/host").toString();
    }
}

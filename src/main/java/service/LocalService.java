package service;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalService {
    private static ResourceBundle resourceBundle;
    private static Locale locale;

    public LocalService() {
    }

    public void changeLocal(String language) {
        locale = new Locale(language);
        resourceBundle =ResourceBundle.getBundle("text", locale);
    }

    public String getString(String phrase) {
        String NeededLangPhrase;
        NeededLangPhrase = resourceBundle.getString(phrase);
        return NeededLangPhrase;
    }
}

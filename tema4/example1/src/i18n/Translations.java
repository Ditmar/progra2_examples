package i18n;

import java.util.HashMap;

import config.Environments;

public class Translations {

    public HashMap<String, HashMap<String, String>> language = new HashMap(); 
    public Translations() {
        HashMap<String, String> en = new HashMap<>();
        en.put(TextCodes.titleText, "Main windows");
        en.put(TextCodes.userNameTextField, "User name");
        en.put(TextCodes.promptText, "We helped in all");
        en.put(TextCodes.registerText, "Register your personal information");
        en.put(TextCodes.notificationText, "do you want to receive notifications");
        en.put(TextCodes.lastNameTextField, "Last name");
        en.put(TextCodes.adminText, "Admin");
        en.put(TextCodes.clientText, "Client");
        en.put(TextCodes.cashierText, "Cashier");
        en.put(TextCodes.enterText, "Login");
        


        HashMap<String, String> es = new HashMap<>();
        es.put(TextCodes.titleText, "Ventana principal");
        es.put(TextCodes.userNameTextField, "Nombre de Usuario");
        es.put(TextCodes.promptText, "Te ayudamos en todo");
        es.put(TextCodes.registerText, "Registra tus datos");
        es.put(TextCodes.notificationText, "quieres recibir notificaciones");
        es.put(TextCodes.lastNameTextField, "Apellido");
        
        es.put(TextCodes.adminText, "Administrador");
        es.put(TextCodes.clientText, "Cliente");
        es.put(TextCodes.cashierText, "Cajero");
        es.put(TextCodes.enterText, "Entrar");
        
        
        language.put("en", en);
        language.put("es", es);
    }
    public String getI18nText(String key) {
        return language.get(Environments.lag).get(key);
    }
}

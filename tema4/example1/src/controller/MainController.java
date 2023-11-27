package controller;
import i18n.Translations;
import context.Login;
import context.DashBoard;
// this is the main controller of all flow of the application
public class MainController {
    Translations translations;
    Login login;
    DashBoard dashBoard;
    public MainController() {
        System.out.println("MainController");
        translations = new Translations();
        login = new Login(translations, translations.getI18nText("title-text"));
        login.addEventListener((String actionEvent) -> {
            if (actionEvent.equals("click-login")) {
                login.hideWindow();
                dashBoard = new DashBoard(translations, translations.getI18nText("DashBoard"));
                dashBoard.showWindow();
            }
        });
        login.showWindow();
    }
}

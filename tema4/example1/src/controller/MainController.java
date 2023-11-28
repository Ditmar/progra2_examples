package controller;
import i18n.Translations;
import context.Login;
import context.RegisterForm;
import data.UserManager;
import data.models.User;
import context.DashBoard;
import java.lang.Object;

import config.Environments;
// this is the main controller of all flow of the application
public class MainController {
    UserManager userManager = new UserManager(Environments.pathFile);
    Translations translations;
    Login login;
    DashBoard dashBoard;
    RegisterForm   registerForm;
    public MainController() {
        System.out.println("MainController");
        translations = new Translations();
        login = new Login(translations, translations.getI18nText("title-text"));
        dashBoard = new DashBoard(translations, translations.getI18nText("DashBoard"));
        registerForm = new RegisterForm(translations, translations.getI18nText("title-text"));
        dashBoard.setData(userManager.getUsers());
        login.addEventListener((String actionEvent, Object data) -> {
            if (actionEvent.equals("click-login")) {
                login.hideWindow();
                dashBoard.showWindow();
            }
        });
        dashBoard.addEventListener((String actionEvent, Object data) -> {
            if (actionEvent.equals("click-register")) {
                //dashBoard.hideWindow();
                registerForm.showWindow();
            }
        });
        registerForm.addEventListener((String actionEvent, Object data) -> {
            User user = (User) data;
            if (actionEvent.equals("click-register")) {
                userManager.saveUser(user);
                dashBoard.refresh(user);
            }
        });
        login.showWindow();
    }
}

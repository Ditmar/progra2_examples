import javax.swing.SwingUtilities;

import context.Login;
import controller.MainController;
import i18n.Translations;

public class App {
    public static void main(String[] args) throws Exception {
        Runnable run = () -> {
            new MainController();
        };
        SwingUtilities.invokeLater(run);
    }
}

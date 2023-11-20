import javax.swing.SwingUtilities;

import i18n.Translations;
import ui.Windows;

public class App {
    public static void main(String[] args) throws Exception {
        Runnable run = () -> {
            Translations lang = new Translations();
            Windows win = new Windows(lang, lang.getI18nText("title-text"));
            win.showWindow();
        };
        SwingUtilities.invokeLater(run);
    }
}

package ui;

import java.awt.Dimension;
import java.awt.TextField;

import utils.CenterLayout;
import utils.Palette;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import i18n.TextCodes;
import i18n.Translations;
import ui.custom.ButtonComponent;
import ui.custom.ComboBoxComponent;
import ui.custom.PasswordTextComponent;
import ui.custom.TextFieldComponent;

public class Windows extends JFrame {
    private Translations lang;

    private String title;
    // panels
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    // labels
    private JLabel promptLabel;
    private JLabel titleLoginLabel;

    private ComboBoxComponent<String> combo;
    private TextFieldComponent userNameTextField;
    private TextFieldComponent lastNameTextField;
    private PasswordTextComponent passwordTextComponent;

    private ButtonComponent button;
    
    public Windows(Translations lang, String title) {
        super(title);
        this.lang = lang;
        this.title = title;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 720);
        setLocationRelativeTo(this);
        setLayout(null);
        createPanels();
        createLabels();
        createTextField();
        createCombo();
        createButton();
    }
    private void createTextField() {
        this.userNameTextField = new TextFieldComponent(this.lang.getI18nText(TextCodes.userNameTextField), this.rightPanel);
        this.userNameTextField.setPosition(40);
        this.rightPanel.add(this.userNameTextField);
        
        this.lastNameTextField = new TextFieldComponent(this.lang.getI18nText(TextCodes.lastNameTextField), this.rightPanel);
        this.lastNameTextField.setPosition(100);
        this.rightPanel.add(this.lastNameTextField);

        this.passwordTextComponent  = new PasswordTextComponent("", this.rightPanel);
        this.passwordTextComponent.setPosition(140);
        this.rightPanel.add(this.passwordTextComponent);
        
    }
    private void createButton() {
        this.button = new ButtonComponent(this.lang.getI18nText(TextCodes.enterText), this.rightPanel);
        this.button.setPosition(220);
        this.rightPanel.add(this.button);
    }
    private void createLabels() {
        this.promptLabel = new JLabel(this.lang.getI18nText(TextCodes.promptText));
        this.promptLabel.setSize(new Dimension(130, 20));
        this.promptLabel.setLocation(CenterLayout.getCenter(this.leftPanel, promptLabel), 10);
        this.promptLabel.setForeground(Palette.fourth);
        this.promptLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.leftPanel.add(this.promptLabel);

        this.titleLoginLabel = new JLabel(this.lang.getI18nText(TextCodes.registerText));
        this.titleLoginLabel.setSize(new Dimension(130, 20));
        this.titleLoginLabel.setLocation(CenterLayout.getCenter(this.leftPanel, titleLoginLabel), 30);
        this.titleLoginLabel.setForeground(Palette.fourth);
        this.titleLoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.leftPanel.add(this.titleLoginLabel);
    }

    private void  createPanels() {
        this.leftPanel = new JPanel();
        this.leftPanel.setSize(new Dimension(600, 500));
        this.leftPanel.setLocation(0, 0);
        this.leftPanel.setBackground(Palette.primary);
        this.leftPanel.setLayout(null);
        this.add(this.leftPanel);
        this.rightPanel = new JPanel();
        this.rightPanel.setSize(new Dimension(400, 500));
        this.rightPanel.setLocation(600, 0);
        this.rightPanel.setBackground(Palette.secondary);
        this.rightPanel.setLayout(null);
        this.add(this.rightPanel);
        this.bottomPanel = new JPanel();
        this.bottomPanel.setSize(new Dimension(1200, 220));
        this.bottomPanel.setLocation(0, 500);
        this.bottomPanel.setBackground(Palette.third);
        this.bottomPanel.setLayout(null);
        this.add(this.bottomPanel);
    }
    private void createCombo() {
        combo = new ComboBoxComponent<>(this.rightPanel);
        combo.addItem(this.lang.getI18nText(TextCodes.adminText));
        combo.addItem(this.lang.getI18nText(TextCodes.cashierText));
        combo.addItem(this.lang.getI18nText(TextCodes.clientText));
        combo.setPosition(180);
        this.rightPanel.add(combo);
    }
    public void showWindow() {
        setVisible(true);
    }
    public void hideWindow() {
        setVisible(false);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
package context;

import ui.custom.BaseWindow;
import ui.custom.PanelBox;
import ui.custom.grid.GridTable;
import ui.custom.grid.table.UserTableModel;
import utils.Palette;

import java.awt.Dimension;
import java.util.ArrayList;

import data.models.User;
import i18n.Translations;

public class DashBoard extends BaseWindow {
    private PanelBox leftBox;
    private PanelBox middle;
    private PanelBox rightBox;
    private Translations lang;
    public DashBoard(Translations lang, String title) {
        super(title);
        this.lang = lang;
        createPanels();
        createGrid();
    }
    public void createGrid() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Jhon", "jhon@gmail.com", "123456", "1234567890"));
        users.add(new User("Martin", "martin@gmail.com", "123456", "123545467890"));
        users.add(new User("Rolando", "rolo@gmail.com", "123456", "123545467890"));
        UserTableModel model = new UserTableModel(users);
        GridTable grid = new GridTable(model);
        this.middle.add(grid.getScrollPane());
    }
    public void createPanels() {
        this.leftBox = new PanelBox();
        leftBox.roundedBorder(20);
        leftBox.setSize(new Dimension(300, 670));
        leftBox.setLocation(10, 10);
        leftBox.setBackground(Palette.secondary);
        leftBox.setLayout(null);
        this.add(leftBox);

        this.middle = new PanelBox();
        middle.roundedBorder(20);
        middle.setSize(new Dimension(600, 670));
        middle.setLocation(320, 10);
        middle.setBackground(Palette.primary);
        middle.setLayout(null);
        this.add(middle);

        this.rightBox = new PanelBox();
        rightBox.roundedBorder(20);
        rightBox.setSize(new Dimension(250, 670));
        rightBox.setLocation(930, 10);
        rightBox.setBackground(Palette.third);
        rightBox.setLayout(null);
        this.add(rightBox);

    }
    
}

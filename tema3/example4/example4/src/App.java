import java.util.ArrayList;

import data.Player;
import data.Server;

public class App {
    public static void main(String[] args) throws Exception {
        Server server = new Server();
        ArrayList<Player> list = server.genData();
        server.printData();
        list.removeIf((player) -> {
            return player.getId() % 2 == 0;
        });
        server.printData();

        list.forEach((item) -> {
            item.printAttributes();
        });
    }
}

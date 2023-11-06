package data;

import java.util.ArrayList;

public class Server {
    ArrayList<Player> list;
    public Server() {
        this.list = new ArrayList<>();
    }
    private String getRandomName (Integer n) {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("pa");
        keys.add("lo");
        keys.add("cris");
        keys.add("to");
        keys.add("rick");
        keys.add("mor");
        keys.add("ti");
        keys.add("ju");
        keys.add("an");
        keys.add("dit");
        keys.add("jo");
        keys.add("se");
        keys.add("ke");
        keys.add("log");
        Integer max = keys.size();
        String name = "";
        for (Integer i = 0; i < n; i++) {
            Double randomIndex =  Math.random() * max;
            Integer index =  randomIndex.intValue();
            name = name + keys.get(index);
        }
        return name;
    }
    public void printData() {
        for (Player player : this.list) {
            System.out.println("--------------------------------");
            System.out.println("id " + player.getId());
            System.out.println("email " + player.getEmail());
            System.out.println("nickname " + player.getNickName());
            System.out.println("country " + player.getCountry());
            System.out.println("lastname " + player.getLastName());
        }
    }
    public ArrayList<Player> genData() {
        for (Integer i = 0; i < 100; i++) {
            this.list.add(new Player(
                i,
                this.getRandomName(2) + "_n",
                this.getRandomName(3) + "_p",
                this.getRandomName(3) + "@gmail.com",
                this.getRandomName(2),
                "Bolivia"
            ));
        }
        return this.list;
    }
}

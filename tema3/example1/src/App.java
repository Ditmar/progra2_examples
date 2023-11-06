import java.util.ArrayList;

import shapes.Circle;
import shapes.Square;

public class App {
    public static void main(String[] args) throws Exception {

        Circle circle = new Circle(19);
        Square square = new Square(10, 12);
        // showAttributes(square);
        // showAttributes(circle);
        ArrayList<interfaces.Process> objectsList = new ArrayList<>();
        objectsList.add(square);
        objectsList.add(circle);
        for (interfaces.Process item : objectsList) {
            showAttributes(item);
        }
    }
    public static void showAttributes(interfaces.Process item) {
        item.print();
        item.increment(10);
    }
}

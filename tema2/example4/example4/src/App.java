import java.util.ArrayList;

import shape.Shape;
import shape.Circle;
import shape.Square;
import shape.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> list = new ArrayList<>();
        Triangle triangle = new Triangle("Black", 10.0, 5.0);
        //triangle.area();
        Circle circle = new Circle("red", 10.0);
        //circle.area();
        Square square = new Square("green", 15.0);
        //square.area();

        list.add(triangle);
        list.add(circle);
        list.add(square);
        for (Shape shape : list) {
            shape.area();
        }

    }
}

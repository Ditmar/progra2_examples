import helper.BaseMath;
import helper.Test;
import helper.Vector;
import helper.VectorMath;

public class App {
    public static void main(String[] args) {
        // Test test = new Test();
        // test.test("Hola mundo", 1, 2);
        // BaseMath anotherOperations = new BaseMath();
        // anotherOperations.add(50, 34);
        VectorMath operations = new VectorMath();
        Vector vectorA = new Vector(2, 5);
        Vector vectorB = new Vector(6, 9);
        Vector result = operations.add(vectorA, vectorB);
        operations.println(result);
         Vector result1 = operations.subtract(vectorA, vectorB);
        operations.println(result1);
        Vector result2 = operations.multiply( 10,  vectorA);
        operations.println(result2);
        // sumas sobrecargadas
        operations.add(50, 10);
        operations.println();

        
        
    }
}

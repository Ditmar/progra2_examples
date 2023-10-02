import java.util.Scanner;
import utils.Log;
import utils.Lottery;

public class App {
    public static void main(String[] args) throws Exception {
        //Ejemplo 1
        // System.out.println("Inserte la base del logaritmo que desea calcular");
        // Scanner read = new Scanner(System.in);
        // Double base = read.nextDouble();
        // System.out.println("Inserte el exponente del logaritmo");
        // Double exp = read.nextDouble();
        // //proceso
        // Double result = Log.logXY(base, exp);
        // System.out.println("El resultado es " + result);
        //Ejemplo 2
        Lottery lottery = new Lottery(50, 150, 1000);
        Integer[] result = lottery.getListResults();
        for (Integer i = 0; i < result.length; i++) {
            System.out.print(" " + result[i] + " ,");
        }
    }
}

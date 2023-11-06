import java.util.function.Predicate;
import java.util.function.Function;
public class App {
    public static void main(String[] args) throws Exception {
        Predicate<Integer> interfacePr = (item) -> item > 10;
        if (interfacePr.test(6)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        Function<String> fc = () -> {
            return null;
        }
    }
}

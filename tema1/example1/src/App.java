import utils.helper.Helper;
import utils.Calc;
public class App {
    public static void main(String[] args) throws Exception {
    //    User myUser1 = new User("Mike", "Miguel", "miguel@gmail.com", "123456");
    //    User myUser2 = new User("Mary", "Maria", "maria@gmail.com", "maria321");
    //    myUser1.greetings();
    //    myUser2.greetings();
    //    User.test();
        Helper helper = new Helper();
        helper.print("Hola desde App");
        Calc calc = new Calc();
        calc.sum(40, 22);

    }
}

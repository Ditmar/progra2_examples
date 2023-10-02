import java.util.Scanner;

import bank.Account;
import bank.LimitAccount;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("My Bank");
        Scanner read = new Scanner(System.in);
        //Account account = null;
        LimitAccount account = null;
        String option = "";
        do {
            printMenu();
            option = read.nextLine();
            switch(option) {
                case "1": {
                    System.out.println("please insert your initial cash");
                    String initialBalance = read.nextLine();
                    account = new LimitAccount(Double.parseDouble(initialBalance));
                    account.updateLimit();
                    System.out.println("Congratulations your account was created! ");
                    break;
                }
                 case "2": {
                    System.out.println("Cash out, set the quantity ");
                    String quantity = read.nextLine();
                    Double doubleQuantity = Double.parseDouble(quantity);
                    if (doubleQuantity < account.getLimit()) {
                        account.balanceOut(doubleQuantity);
                        account.updateLimit();
                        System.out.println("cash out was made");
                    }
                    
                    break;
                }
                case "3": {
                    System.out.println("Cash in, set the quantity ");
                    String quantity = read.nextLine();
                    Double doubleQuantity = Double.parseDouble(quantity);
                    account.balanceIn(doubleQuantity);
                    System.out.println("cash in was made");
                    break;
                }
                case "4": {
                    account.printBalance();
                    break;
                }
            }
        } while(!option.equals("5"));
    }
    public static void printMenu() {
        System.out.println("1. Create account");
        System.out.println("2. Cash out");
        System.out.println("3. Cash in ");
        System.out.println("4. print balance");
        System.out.println("5. close app");
    }
}

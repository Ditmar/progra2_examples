import java.util.Scanner;

import schedule.ManagerContact;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        ManagerContact manager = new ManagerContact();
        String option = null;
        do {
            printMenu();
            option = read.nextLine();
            switch(option) {
                case "1": {
                    System.out.println("Write the name, age, and email of the contact");
                    String name = read.nextLine();
                    String age = read.nextLine();
                    String email = read.nextLine();
                    manager.add(name, Integer.parseInt(age), email);
                    break;
                }
                case "2": {
                    System.out.println("Please use the email to seek a contact into the database");
                    String email = read.nextLine();
                    manager.search(email);
                    break;
                }
                case "3": {
                    System.out.println("If you want to remove a contact please write the email of the contact");
                    String email = read.nextLine();
                    manager.remove(email);
                    break;
                }
                case "4": {
                    manager.printList();
                    break;
                }
            }
        } while(!option.equals("5"));
    }
    public static void printMenu() {
        System.out.println("1.) Add contact");
        System.out.println("2.) Search contact");
        System.out.println("3.) Remove contact");
        System.out.println("4.) Show all");
        System.out.println("5.) exit");
    }
}

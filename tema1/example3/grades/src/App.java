import java.util.Scanner;

import grades.Grades;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to grades system");
        Scanner read = new Scanner(System.in);
        Grades managementGrades = new Grades();
        Integer option = null;
        do {
            printMenu();
            option = read.nextInt();
            if (option == 1) {
                System.out.println("please insert a grade");
                Integer grade = read.nextInt();
                // todo: add the grade into the list
                managementGrades.addGrade(grade);
            }
            if (option == 2) {
                System.out.println("Show all Grades");
                managementGrades.showAllGrades();
            }
            if (option == 3) {
                System.out.println("Show the good students");
                managementGrades.showAproved();
            }
        } while(option != 4);
    }
    public static void printMenu() {
        System.out.println("1.) add grade");
        System.out.println("2.) Show grade");
        System.out.println("3.) Review approved");
        System.out.println("4.) Exit grades system");
    }
}

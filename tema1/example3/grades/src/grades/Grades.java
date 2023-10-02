package grades;

import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> listGrades;
    public Grades() {
        this.listGrades = new ArrayList<>();
    }
    public void addGrade(Integer grade) {
        this.listGrades.add(grade);
    }
    public void showAllGrades() {
        for (Integer grade : this.listGrades) {
            System.out.println("*. Grades : " + grade);
        }
    }
    public void showAproved() {
        for (Integer grade : this.listGrades) {
            if (grade >= 51) {
                System.out.println("A. Grades : " + grade);
            }
            
        }
    }
}

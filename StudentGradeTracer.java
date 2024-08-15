import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracer {

    private ArrayList<Double> grades;

    public StudentGradeTracer() {
        grades = new ArrayList<>();
    }

    public void addMarks(double marks) {
        grades.add(marks);

    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        double average = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
            average = sum / grades.size();
        }
        return average;
    }

    public double calculateHighestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double highestGrade = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (highestGrade < grades.get(i)) {
                highestGrade = grades.get(i);
            }
        }
        return highestGrade;
    }

    public double calculateLowestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double lowestGrade = Double.MAX_VALUE;
        for (int i = 0; i < grades.size(); i++) {
            if (lowestGrade > grades.get(i)) {
                lowestGrade = grades.get(i);
            }
        }
        return lowestGrade;
    }

    public static void main(String[] args) {
        System.out.println("*****  WELCOME TO STUDENT GRADE TRACKER  *****");
        System.out.println("\n");
        Scanner scan = new Scanner(System.in);
        StudentGradeTracer grades = new StudentGradeTracer();

        while (true) {
            System.out.print("\tEnter a grade (or '-1' to finish): ");
            double grade = scan.nextDouble();
            if (grade == -1) {
                break;
            }
            grades.addMarks(grade);
        }

        System.out.println("Grade Summary:");
        System.out.println("\tAverage Grade: " + grades.calculateAverage());
        System.out.println("\tHighest Grade: " + grades.calculateHighestGrade());
        System.out.println("\tLowest Grade: " + grades.calculateLowestGrade());

        scan.close();


    }


}






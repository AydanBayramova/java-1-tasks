package Module0.CharApp.Lesson1.JavaTaskSolution;

import java.util.Scanner;

public class Lesson1GradeApp {
    public static void main(String[] args) {
        System.out.println("Enter your grade point:");
        final double grade = new Scanner(System.in).nextDouble();
        String result = "Wrong Answer";

        if (grade >= 91 && grade <= 100) {
            result = "A";
        } else if (grade >= 81) {
            result = "B";
        } else if (grade >= 71) {
            result = "C";
        } else if (grade >= 61) {
            result = "D";
        } else if (grade >= 51) {
            result = "E";
        } else if (grade >= 0) {
            result = "F";
        }

        System.out.println("Result: " + result);
    }
}

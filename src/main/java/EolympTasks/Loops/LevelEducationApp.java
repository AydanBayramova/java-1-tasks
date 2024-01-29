package EolympTasks.Loops;

import java.util.Scanner;

public class LevelEducationApp {
    public static void main(String[] args) {
        int grade = new Scanner(System.in).nextInt();

        if (grade >= 1 && grade <= 3) {
            System.out.print("Initial");
        } else if (grade >= 4 && grade <= 6) {
            System.out.print("Average");
        } else if (grade >= 7 && grade <= 9) {
            System.out.print("Sufficient");
        } else if (grade >= 10 && grade <= 12) {
            System.out.print("High");
        }
    }
}

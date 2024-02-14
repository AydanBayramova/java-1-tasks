package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class MonthQuarter {
    public static void main(String[] args) {
        int monthQuarter = new Scanner(System.in).nextInt();
        if (monthQuarter >= 1 && monthQuarter <= 12) {
            if (monthQuarter == 1 || monthQuarter == 2 || monthQuarter == 3) {
                System.out.println("First");
            } else if (monthQuarter == 4 || monthQuarter == 5 || monthQuarter == 6) {
                System.out.println("Second");
            } else if (monthQuarter == 7 || monthQuarter == 8 || monthQuarter == 9) {
                System.out.println("Third");
            } else {
                System.out.println("Fourth");
            }
        }
    }
}

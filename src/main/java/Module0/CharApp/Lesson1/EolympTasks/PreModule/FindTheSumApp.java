package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class FindTheSumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double sum = 0;
        if (a > 0 && a <= 1000) {
            for (int i = 1; i <= a; i++) {
                sum += 1.0 / (i * (i + 1));
            }
        }
        System.out.printf("%.6f", sum);
    }
}

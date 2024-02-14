package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class ValueOfVariable4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        System.out.printf("%.3f", (((2 * x) - 1) / Math.pow(x, 2)) + (Math.sqrt(Math.pow(x, 2) + 1)) / 2);
    }
}

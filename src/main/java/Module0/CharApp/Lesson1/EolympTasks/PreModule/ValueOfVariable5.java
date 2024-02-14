package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class ValueOfVariable5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        System.out.printf("%.3f", ((2 * x) / Math.sqrt(Math.pow(x, 2) + 1)) - ((Math.sqrt(Math.pow(x, 2) + 1)) / Math.pow(x, 3)));
    }
}

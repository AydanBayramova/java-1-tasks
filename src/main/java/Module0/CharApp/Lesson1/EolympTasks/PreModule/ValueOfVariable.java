package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class ValueOfVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        System.out.printf("%.3f", (Math.pow(x, 2) + 3 * x - 4) / (2 * x - 3) - (x + 2) / (Math.pow(x, 2) - 5 * x + 7));
    }
}

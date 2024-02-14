package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double result = f(x, y);
            System.out.printf("%.4f%n", result);
        }
    }

    public static double f(double x, double y) {
        return x * x + Math.sin(x * y) - y * y;
    }
}

package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class VariableValueApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = (Math.sqrt(Math.pow(x, 4) + 1) / Math.pow(x,2)) - (Math.sqrt(Math.pow(x, 2) / (Math.pow(x, 2) + 1)));
        System.out.printf("%.3f", y);
    }
}

package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class SimpleFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.printf("%.4f", a + Math.sin(a));
    }
}

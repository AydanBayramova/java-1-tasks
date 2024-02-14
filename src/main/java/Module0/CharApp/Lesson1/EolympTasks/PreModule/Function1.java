package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            System.out.printf("%.4f\n", (Math.pow(x, 3) + 2 *Math.pow(x,2) - 3));
        }
    }

}

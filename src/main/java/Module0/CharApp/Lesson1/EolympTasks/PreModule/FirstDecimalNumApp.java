package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class FirstDecimalNumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean found = false;

        if (n > 0 && n <= 100) {
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextDouble();
                if (arr[i] <= 2.5 && !found) {
                    System.out.printf((i + 1) + " " + "%.2f", arr[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Not Found");
            }
        }
    }
}

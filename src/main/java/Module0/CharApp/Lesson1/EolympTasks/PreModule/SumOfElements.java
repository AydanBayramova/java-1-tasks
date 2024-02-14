package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        if (n > 0 && n <= 100) {
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextDouble();
                sum += arr[i];
            }
        }

        System.out.printf("%.1f", sum);
    }
}

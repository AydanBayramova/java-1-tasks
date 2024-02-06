package EolympTasks.PreModule;

import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double arr[] = new double[a];
        int count = 0;
        double sum = 0;
        if (a > 0 && a <= 100) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextDouble();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    count++;
                    sum += arr[i];


                }

            }
            System.out.printf("%d %.2f",count,sum);
        }
    }
}

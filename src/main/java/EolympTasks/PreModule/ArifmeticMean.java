package EolympTasks.PreModule;

import java.util.Scanner;

public class ArifmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        double count = 0;
        double point = 0;
        boolean posNumber = false;
        if (n > 0 && n <= 100) {
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextDouble();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                    count++;
                    posNumber = true;
                }

            }
            if (!posNumber) {
                System.out.println("Not Found");
            } else {
                point = sum / count;
                System.out.println(point);
            }
        }

    }

}

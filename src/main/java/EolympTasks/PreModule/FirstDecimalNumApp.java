package EolympTasks.PreModule;

import java.util.Scanner;

public class FirstDecimalNumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0 && n <= 100) {
            double arr[] = new double[n];
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextDouble();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 2.5 && !found) {
                    System.out.println((i+1)+ " " + arr[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Not Found");
            }

        }
    }
}

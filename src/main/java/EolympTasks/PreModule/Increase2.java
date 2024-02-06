package EolympTasks.PreModule;

import java.util.Scanner;

public class Increase2 {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //process
        if (n <= 100) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] >= 0) {
                    arr[i] += 2;
                }
            }
            //output
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("");
        }
    }
}

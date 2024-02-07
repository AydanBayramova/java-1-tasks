package EolympTasks.PreModule;

import java.util.Scanner;

public class OddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0 && a <= 100) {
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                if (arr[i] <= 100) {
                    arr[i] = scanner.nextInt();
                }
            }
            for (int i = 0; i < a; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i]+" ");
                }
            }
        }

    }
}

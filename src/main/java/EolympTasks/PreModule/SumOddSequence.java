package EolympTasks.PreModule;

import java.util.Scanner;

public class SumOddSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            if (n >= 1 && n <= 100) {
                for (int j = 1; j <= n; j += 2) {
                    sum = sum + j;
                }

            }
            System.out.println(sum);
        }


    }
}


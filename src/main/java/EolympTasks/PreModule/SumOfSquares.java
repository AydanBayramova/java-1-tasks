package EolympTasks.PreModule;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (n >= 1 && n <= Math.pow(10, 6)) {
            long sum = n * (n + 1) * (2 * n + 1) / 6;
            System.out.print(sum);
        }
    }
}

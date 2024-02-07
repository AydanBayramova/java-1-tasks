package EolympTasks.PreModule;

import java.util.Scanner;

public class RatioSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long sum = 0;
        long multi = 1;

        while (n > 0) {
            long digit = n % 10;
            sum += digit;
            multi *= digit;
            n /= 10;
        }
        double ratio = (double) multi / sum;
        System.out.printf("%.3f",ratio);
    }
}

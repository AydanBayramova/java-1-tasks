package EolympTasks.PreModule;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a > 99 && a <= 999) {
            int b = a / 100;
            int c = a % 100;
            int d = c / 10;
            int e = c % 10;
            int sum = b + d + e;
            System.out.printf("%.3f", Math.sqrt(sum));
        }
    }
}

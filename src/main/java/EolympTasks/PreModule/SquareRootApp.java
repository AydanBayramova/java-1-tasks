package EolympTasks.PreModule;

import java.util.Scanner;

public class SquareRootApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        if (a >= 1 && a <= Math.pow(10, 16)) {
            System.out.printf("%.6f", Math.sqrt(a));
        }
    }
}

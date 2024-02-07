package EolympTasks.PreModule;

import java.util.Scanner;

public class SquaresOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();

        for (int i = 1; i * i <= a; i++) {
            System.out.print((long) Math.pow(i, 2) + " ");
        }
    }
}

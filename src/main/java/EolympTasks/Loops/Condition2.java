package EolympTasks.Loops;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        if (x >= 10) {
            System.out.println((long) (Math.pow(x, 3) + 5 * x));
        } else {
            System.out.println((long) (Math.pow(x, 2) - 2 * x + 4));
        }

    }
}

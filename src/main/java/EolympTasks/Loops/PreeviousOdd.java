package EolympTasks.Loops;

import java.util.Scanner;

public class PreeviousOdd {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
            if (n % 2 == 0) {
                System.out.println(n - 1);
            } else if (n % 2 != 0) {
                System.out.println(n - 2);
            }

    }
}

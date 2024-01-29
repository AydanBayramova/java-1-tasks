package EolympTasks.Loops;

import java.util.Scanner;

public class OneDigits {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n / 10 == 0) {
            System.out.println("OK");
        } else {
            System.out.println("No");
        }
    }
}

package EolympTasks.Loops;

import java.util.Scanner;

public class SameSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m != 0 && n != 0) {
            if (m > 0 && n > 0 || m < 0 && n < 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

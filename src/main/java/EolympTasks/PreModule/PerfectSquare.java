package EolympTasks.PreModule;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int m = (int) Math.sqrt(n);
        if (Math.pow(m, 2) == n) {
            System.out.println((int) Math.sqrt(n));
        } else {
            System.out.println("No");
        }
    }
}

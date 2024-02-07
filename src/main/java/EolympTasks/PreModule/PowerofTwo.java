package EolympTasks.PreModule;

import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        if (a >= 0 && a <= Math.pow(2, 31)) {
            if (Math.log(a) / Math.log(2) == (int) (Math.log(a) / Math.log(2))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}

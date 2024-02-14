package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class SumDisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        long sum = 0;
        if (k > 0 && k <= Math.pow(10, 8)) {
            for (int i = 1; i <= k; i++) {
                sum += i;
                if (sum % k == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}

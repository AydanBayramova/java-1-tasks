package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class PowerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        if (k >= 0 && n <= 30) {
            System.out.println((int) (Math.pow(2, k) + Math.pow(2, n)));
        }
    }
}

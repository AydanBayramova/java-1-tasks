package Module0.CharApp.Lesson1.EolympTasks.Loops;

import java.util.Scanner;

public class DisibiltyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (n % a == 0 && n % b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

package EolympTasks;

import java.util.Scanner;

public class MaxNumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int first = Math.max(a, b);
        int second = Math.max(c, d);
        System.out.println(Math.max(first, second));
    }
}

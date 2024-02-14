package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class TriangleSidesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c && b == c && a == c) {
            System.out.println(1);
        } else if (a == b || b == c || c == a) {
            System.out.println(2);
        } else if (a != b || a != c || c != a || b != c) {
            System.out.println(3);
        }
    }
}

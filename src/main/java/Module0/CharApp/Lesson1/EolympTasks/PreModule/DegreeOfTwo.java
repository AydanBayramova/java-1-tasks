package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class DegreeOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        if (a > 0 && a <= Math.pow(2, 31)) {
            if (a % 4 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

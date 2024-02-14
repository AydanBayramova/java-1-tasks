package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y = scanner.nextInt();
        long z = scanner.nextInt();
        long sum = (x * y * z) + x + (y * y) + (z * z * z);
        System.out.println(sum);

    }
}

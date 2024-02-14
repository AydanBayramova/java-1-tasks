package Module0.CharApp.Lesson1.EolympTasks.Loops;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        if (x >= -100 && x <= 100) {
            if (x < -4) {
                System.out.println(x + 5);
            } else if (x >= (-4) && x <= 7) {
                System.out.println((int) Math.pow(x, 2) - 3 * x );

            } else if (x > 7) {
                System.out.println((int) Math.pow(x, 3) + 2 * x);

            }
        }
    }
}

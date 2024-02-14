package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class PowerofTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextLong();
            if ((int)(Math.log(n) / Math.log(2)) % 1 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }

}

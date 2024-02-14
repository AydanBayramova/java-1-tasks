package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        if (n >= 1 && n <= Math.pow(10, 9)) {
            System.out.println(n % 10);
        }
    }

}

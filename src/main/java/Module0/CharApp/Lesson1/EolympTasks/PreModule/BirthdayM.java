package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class BirthdayM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        int age = 0;
        long total = 0;
        long current = 0;

        while (total < s) {
            age++;
            total += 2 * current + age;
            current = 2 * current + age;
        }

        System.out.print(age);
    }
}

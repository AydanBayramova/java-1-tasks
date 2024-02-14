package Module0.CharApp.Lesson1.EolympTasks;

import java.util.Scanner;

public class StreetNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        boolean side = m % 2 == n % 2;
        System.out.println(side ? 1 : 0);
    }
}

package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class SumofNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}

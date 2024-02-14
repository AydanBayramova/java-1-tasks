package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class SumandAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a <= 100) {
                count++;
                sum += a;
            }else {
                break;
            }
        }
        System.out.println(count + " " + sum);

    }
}

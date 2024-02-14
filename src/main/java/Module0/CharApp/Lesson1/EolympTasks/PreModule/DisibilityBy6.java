package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class DisibilityBy6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        if (n > 0 && n <= 100) {
            int[] arr = new int[n];

               for (int i = 0; i < arr.length; i++) {
                   arr[i] = scanner.nextInt();
           }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 6 == 0 && arr[i]>0) {
                    sum += arr[i];
                    count++;

                }
            }
            System.out.println(count + " " + sum);

        }
    }
}

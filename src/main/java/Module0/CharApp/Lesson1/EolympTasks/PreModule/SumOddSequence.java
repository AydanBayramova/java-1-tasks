package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class SumOddSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] <= 100) {
                sum += arr[i];
                System.out.println(sum);
            }
        }


    }
}


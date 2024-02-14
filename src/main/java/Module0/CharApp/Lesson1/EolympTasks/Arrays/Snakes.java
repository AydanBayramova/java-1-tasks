package Module0.CharApp.Lesson1.EolympTasks.Arrays;

import java.util.Scanner;

public class Snakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[][] arr = new int[number][number];
        int num = 1;

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < number; j++) {
                    arr[i][j] = num++;
                }
            } else {
                for (int j = 0; j < number; j++) {
                    arr[i][number - 1 - j] = num++;
                }
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package Module0.CharApp.Lesson1.EolympTasks.Arrays;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        if (1 <= n && m <= 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = i * m + j + 1;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}

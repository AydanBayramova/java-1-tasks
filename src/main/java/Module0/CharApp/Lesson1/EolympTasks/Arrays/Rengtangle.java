package Module0.CharApp.Lesson1.EolympTasks.Arrays;

import java.util.Scanner;

public class Rengtangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] arr = new char[n][m];
        if ((n > 0 && n <= 100) && (m > 0 && m <= 100)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = '#';
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

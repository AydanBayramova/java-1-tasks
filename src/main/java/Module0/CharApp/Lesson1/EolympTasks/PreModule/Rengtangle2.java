package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class Rengtangle2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        char[][] arr = new char[4][n];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '#';
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

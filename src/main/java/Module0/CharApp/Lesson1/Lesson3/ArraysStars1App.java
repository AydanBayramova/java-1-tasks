package Module0.CharApp.Lesson1.Lesson3;

import java.util.Scanner;

public class ArraysStars1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        char[][] testArray = new char[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                testArray[i][j] = '*';
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(testArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}


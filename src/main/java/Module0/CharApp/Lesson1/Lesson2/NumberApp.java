package Module0.CharApp.Lesson1.Lesson2;

import java.util.Scanner;

public class NumberApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        for ( int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

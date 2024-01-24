package Lesson2;

import java.util.Scanner;

public class NumberApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int i = 1;
        for (; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
            }

        }
    }
}

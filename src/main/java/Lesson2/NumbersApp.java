package Lesson2;

import java.util.Scanner;

public class NumbersApp {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
        System.out.println("number " + number + ":");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");

                if (i % 2 != 0) {
                    System.out.print("Odd number:" + i);
                } else {
                    System.out.print("Even number:" + i);
                }
            }
        }
    }
}

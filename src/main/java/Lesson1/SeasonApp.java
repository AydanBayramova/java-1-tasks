package Lesson1;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int i;
        if (number > 1 && number < 12) {
            if (number == 1) {
                System.out.println("january");
            } else if (number == 2) {
                System.out.println("february");

            } else if (number == 3) {
                System.out.println("mart");

            } else if (number == 4) {
                System.out.println("april");

            } else if (number == 5) {
                System.out.println("may");

            } else if (number == 6) {
                System.out.println("june");

            } else if (number == 7) {
                System.out.println("jule");

            } else if (number == 8) {
                System.out.println("august");

            } else if (number == 9) {
                System.out.println("sempember");

            } else if (number == 10) {
                System.out.println("november");

            } else {
                System.out.println("december");
            }
        }

    }
}

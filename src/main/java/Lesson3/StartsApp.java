package Lesson3;

import java.util.Scanner;

public class StartsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startsNumber = scanner.nextInt();
        for (int i = 1; i <= startsNumber; i++) {
            for (int j = i; j <= startsNumber; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= startsNumber; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= startsNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2 * (startsNumber - i); j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


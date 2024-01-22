package Lesson1;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if (number > 1 && number < 12) {
            if (number >= 3 && number <= 5) {
                System.out.println("spring");
            } else if (number >= 6 && number <= 9) {
                System.out.println("summer");
            } else if (number >= 10 && number <= 11) {
                System.out.println("autumn");
            } else {
                System.out.println("winter");
            }
        }

    }
}

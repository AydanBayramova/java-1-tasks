package Lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir reqem girin:");
        int number = scanner.nextInt();
        String a;
        String season = (number > 0 && (number == 12 || number == 1 || number == 2)) ? (a = "winter") :
                ((number == 3 || number == 4 || number == 5) ? (a = "spring") :
                        ((number == 6 || number == 7 || number == 8) ? (a = "summer") :
                                ((number == 9 || number == 10 || number == 11) ? (a = "winter") : (a = "Ele bir fesil yokkkk :)"))));

        System.out.println(season);

    }
}

package EolympTasks.Loops;

import java.util.Scanner;

public class FirstLastNumApp {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();

        int firstDigit = input / 100;
        int lastDigit = input % 10;

        if (firstDigit != lastDigit) {
            System.out.print(Math.max(firstDigit, lastDigit));
        } else {
            System.out.print("Equal");
        }
    }
}

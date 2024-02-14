package Module0.CharApp.Lesson1.EolympTasks.Loops;

import java.util.Scanner;

public class SumDigitsApp {
    public static void main(String[] args) {
        int inputNumber = new Scanner(System.in).nextInt();
        int a = inputNumber / 1000;
        int b = inputNumber % 10;
        if (inputNumber >= 1000 && inputNumber <= 9999) {
            System.out.println(a + b);
        }
    }

}

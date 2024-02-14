package Module0.CharApp.Lesson1.EolympTasks;

import java.util.Scanner;

public class ProductsDigits {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        int a = input / 100;
        int b = (input / 10) % 10;
        int c = input % 10;

        if (input >= 100 && input <= 999) {
            System.out.println(a * b * c);
        } else {
            System.out.println("write 3 digits number");
        }
    }
}


package module01.Lesson11;

import java.util.Scanner;

public class NumberDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        String firstInput = scanner.nextLine();
        System.out.println("Enter second number:");
        String secondInput = scanner.nextLine();

        final int num1 = Integer.parseInt(firstInput);
        final int num2 = Integer.parseInt(secondInput);
        int result = num1 / num2;
        System.out.println(result);
    }
}

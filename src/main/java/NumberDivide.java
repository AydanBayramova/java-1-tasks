import java.util.Scanner;

public class NumberDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        String number1 = scanner.nextLine();
        System.out.println("Enter second number:");
        String number2 = scanner.nextLine();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        System.out.println(num1 / num2);
    }
}

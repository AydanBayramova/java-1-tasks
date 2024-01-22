package Lesson1;

import java.util.Scanner;

public class RemainderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = scanner.nextInt();
        System.out.print("Enter second number ");
        int b = scanner.nextInt();
        int remainder = a % b;
        System.out.println("This is remainder " + remainder);
    }
}

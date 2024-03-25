package module01.Part02.Exception.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        int test = computeSequence(inputString());
        System.out.println(test);
    }

    public static String inputString() {
        File file = new File("C:\\Users\\aydan\\IdeaProjects\\java-course-turing-1-classes\\src\\main\\java\\module01\\Part02\\Exception\\lab2\\file.txt");
        String word = "";
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            word = scanner.next();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            scanner = new Scanner(System.in);
            word = scanner.nextLine();
        } finally {
            scanner.close();
        }
        return word;
    }

    public static int computeSequence(String input) {
        try {
            if (input.length() < 2) {
                throw new IllegalArgumentException("String length is less then 2");
            }
            int num = Integer.parseInt(input);
            int sum = 0;
            int last = num % 10;
            while (num > 10) {
                sum += num % 10;
                num /= 10;
            }
            return (sum - last) / last;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter a valid String");
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("Sum cannot divide by zero!");
            return -1;
        }


    }
}


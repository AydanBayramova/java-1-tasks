package Module0.CharApp.Lesson1;

import java.util.Scanner;

public class WordApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write words");
        String word = scanner.nextLine();
        System.out.println(word.length() * 2);
    }
}

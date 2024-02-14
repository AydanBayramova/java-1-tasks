package Module0.CharApp.Lesson1.lesson7.lesson5;

import java.util.Locale;
import java.util.Scanner;

public class WordApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase(Locale.ROOT));
        System.out.println(word.trim());
        System.out.println(word.substring(1,2));
        System.out.println(word.substring(2));
    }

}

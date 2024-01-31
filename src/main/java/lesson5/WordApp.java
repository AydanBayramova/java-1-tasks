package lesson5;

import java.util.Scanner;

public class WordApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.trim());
        System.out.println(word.substring(1,2));
        System.out.println(word.substring(2));
    }

}

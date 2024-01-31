package lesson5;

import java.util.Scanner;

public class WordApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.print(word.length());
        System.out.print(word.toLowerCase());
        System.out.print(word.toUpperCase());
        System.out.print(word.trim());
        System.out.print(word.substring(1,2));
        System.out.print(word.substring(2));
    }

}

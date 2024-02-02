package lesson6.java;

import java.util.Scanner;

public class CharApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String gmail = charsApp(surname);
        int nameLength = charsApp1(name);
        System.out.println(gmail);
        System.out.println(nameLength);

    }

    public static int charsApp1(String name) {
        return name.length();
    }

    public static String charsApp(String surname) {
        return surname.substring(0,5);
    }
}

package lesson6.java;

import java.util.Scanner;

public class CharApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String gmail = CharsApp(surname);
        int nameLength = CharsApp1(name);
        System.out.println(gmail);
        System.out.println(nameLength);

    }

    public static int CharsApp1(String name) {
        return name.length();
    }

    public static String CharsApp(String surname) {
        return surname.replace("@", " ");
    }
}

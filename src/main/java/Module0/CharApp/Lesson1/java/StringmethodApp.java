package Module0.CharApp.Lesson1.java;

import java.util.Scanner;

public class StringmethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
       final String email= scanner.nextLine();
        String email1 = stringApp(email);
        int nameLength = stringApp1(name);
        System.out.println(email1);
        System.out.println(nameLength);

    }

    public static int stringApp1(String name) {
        return name.length();
    }

    public static String stringApp(String gmail) {
        return gmail.substring(0,gmail.indexOf("@"));
    }
}

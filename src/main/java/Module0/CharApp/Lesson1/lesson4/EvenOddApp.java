package Module0.CharApp.Lesson1.lesson4;

import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("area " + Math.pow(a, 2) + "perimetr " + 4 * a);
        System.out.println("area circle:");
        int r = scanner.nextInt();
        System.out.println("length " + Math.PI * 2 * r + "area " + Math.PI * Math.pow(r, 2));

    }

}

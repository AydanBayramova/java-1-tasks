package lesson4;

import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println("area " + Math.pow(a, 2) + "perimetr " + 4 * a);
        System.out.println("area circle:");
        int r = new Scanner(System.in).nextInt();
        System.out.println(Math.PI * 2 * r + "area" + Math.PI * Math.pow(r, 2));

    }
}

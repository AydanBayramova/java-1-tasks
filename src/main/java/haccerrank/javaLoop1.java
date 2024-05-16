package haccerrank;

import java.util.Scanner;

public class javaLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 2 && num <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf(num+"x"+i+"=%d\n", num*i);
            }
        }

    }
}

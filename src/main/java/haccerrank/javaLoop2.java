package haccerrank;

import java.util.Scanner;

public class javaLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter time");
        long time = in.nextLong();
        for (int i = 0; i < time; i++) {
            System.out.println("enter first number");
            long a = in.nextLong();
            System.out.println("enter second number");
            long b = in.nextLong();
            System.out.println("enter third number");
            long n = in.nextLong();
            for (int j = 0; j <n; j++) {
                a = a + (int)Math.pow(2,j)*b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        in.close();
    }
}

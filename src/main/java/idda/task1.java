package idda;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long sum = 0;
        if (a >= 0 && a <= b && b <= Math.pow(10, 9)) {
            for (long i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }


    }
}


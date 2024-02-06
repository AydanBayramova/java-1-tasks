package Questions;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = b; j >=i; j--) {
                System.out.print("  ");
            }
            for (int j = b; j >=i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=b; i++) {
            for (int j = i; j <=b ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=b ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=b ; j++) {
                System.out.print(" ");
            }
            for (int j = b; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

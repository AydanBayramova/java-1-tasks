package idda;

import java.util.Scanner;

public class CountValidTriples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = getValidInt(scanner);
        int b = getValidInt(scanner);
    if (a>=0 && a<=1000 && b>=0 && b<=Math.pow(10,6)){
        int count = 0;
        for (int x =1; x <= a; x++) {
            int max_y = Math.min(a - x, b / x);

            for (int y = 1; y <= max_y; y++) {
                int max_z = Math.min(a - x - y, b / (x * y));
                count += max_z + 1;
            }
        }
        System.out.println( count);
        scanner.close();
    }
    }
    private static int getValidInt(Scanner scanner) {
        while (true) {
            int value = scanner.nextInt();
            if (value >= 0) {
                return value;
            }
        }
    }
}

package EolympTasks.PreModule;

import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n++;
            }
            counter++;
        }

        System.out.println(counter);
    }
}

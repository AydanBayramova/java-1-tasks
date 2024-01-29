package EolympTasks.Loops;

import java.util.Scanner;

public class OutsideIntervalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (x < a || x > b) {
            System.out.println("OUT");
        } else {
            System.out.println("IN");
        }
    }
}

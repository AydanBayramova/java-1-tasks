package EolympTasks;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        if (a != 0 && a>0) {
            if (b % a != 0) {
                System.out.println(b / a + " " + b % a);
            } else {
                System.out.println("Divisible");
            }
        } else {
            System.out.println("A can't divide b");
        }
    }
}

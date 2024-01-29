package EolympTasks.Loops;

import java.util.Scanner;

public class OddEvenApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}

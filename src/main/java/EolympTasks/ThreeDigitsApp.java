package EolympTasks;

import java.util.Scanner;

public class ThreeDigitsApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n / 100 == 0) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}

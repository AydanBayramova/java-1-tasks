package EolympTasks;

import java.util.Scanner;

public class SeparateNumApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.print(number / 10 + " " + number % 10);

    }
}

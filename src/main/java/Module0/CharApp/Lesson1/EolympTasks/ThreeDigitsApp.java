package Module0.CharApp.Lesson1.EolympTasks;

import java.util.Scanner;

public class ThreeDigitsApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n / 100 == 0 && n / 10 != 0) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}

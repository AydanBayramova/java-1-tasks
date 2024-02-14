package Module0.CharApp.Lesson1.EolympTasks.Loops;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("Winter");
                    break;
            }
        } else {
            System.out.println("wrong");
        }
    }
}

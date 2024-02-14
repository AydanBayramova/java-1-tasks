package Module0.CharApp.Lesson1.lesson7;

import java.util.Scanner;

public class WeekPlanApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] arr = new String[7][2];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextLine();
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("schedule:"+arr[i][j]);
            }
        }


        System.out.println("Please, input the day of the week:");
        String weekDay = scanner.nextLine().toLowerCase().trim();


        switch (weekDay) {
            case "monday":
                System.out.println("Your tasks for Monday: " + arr[0][0] + "; " + arr[0][1]);
                break;
            case "tuesday":
                System.out.println("Your tasks for Tuesday: " + arr[1][0] + "; " + arr[1][1]);
                break;
            case "wednesday":
                System.out.println("Your tasks for Wednesday: " + arr[2][0] + "; " + arr[2][1]);
                break;
            case "thursday":
                System.out.println("Your tasks for Thursday: " + arr[3][0] + "; " + arr[3][1]);
                break;
            case "friday":
                System.out.println("Your tasks for Friday: " + arr[4][0] + "; " + arr[4][1]);
                break;
            case "saturday":
                System.out.println("Your tasks for Saturday: " + arr[5][0] + "; " + arr[5][1]);
                break;
            case "sunday":
                System.out.println("Your tasks for Sunday: " + arr[6][0] + "; " + arr[6][1]);
                break;
            default:
                if (weekDay.equals("exit")) {
                    System.out.println("Exiting the program...");
                } else {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
                break;
        }
    }
}

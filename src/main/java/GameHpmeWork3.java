import java.util.Scanner;

public class GameHpmeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of weekdays:");
        int WeekDay = scanner.nextInt();

        System.out.println("Enter the daily plan:");
        int DailyPlan = scanner.nextInt();
        scanner.nextLine(); // satır sonu karakterini oku ve atla

        int arr[][] = new int[WeekDay][DailyPlan];

        for (int i = 0; i < WeekDay; i++) {
            for (int j = 0; j < DailyPlan; j++) {
                System.out.println("Enter the value for day " + (i+1) + ", plan " + (j+1) + ":");
                arr[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < WeekDay; i++) {
            for (int j = 0; j < DailyPlan; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

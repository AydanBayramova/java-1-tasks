package EolympTasks.Arrays;

import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr1=new int[2];
        if (number > 9 && number < 100) {
            arr1[0] = number / 10;
            arr1[1] = number % 10;
            System.out.println((int)Math.pow((arr1[0]+arr1[1]),2));
        }
    }
}

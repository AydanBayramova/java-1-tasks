package Module0.CharApp.Lesson1.Lesson3;

import java.util.Scanner;

public class TwoMoreDimArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int array[][] = new int[number][number];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
              if ((i+j)<number){
                  System.out.println("*");
              }
            }
        }
        System.out.println();

    }
}

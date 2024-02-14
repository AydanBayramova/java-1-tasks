package Module0.CharApp.Lesson1.Lesson3;

import java.util.Scanner;

public class ArrraysStratApp {
    public static void main(String[] args) {
        int number= new Scanner(System.in).nextInt();
        char[][] starsArray=new char[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j >= i; j++) {
                 starsArray[i][j]='*';
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print( starsArray[i][j]);
            }
            System.out.println();
        }
    }
}

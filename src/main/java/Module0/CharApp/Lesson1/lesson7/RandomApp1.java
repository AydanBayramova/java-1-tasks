package Module0.CharApp.Lesson1.lesson7;

import java.util.Scanner;

public class RandomApp1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you name");
        String name= scanner.nextLine();
        System.out.println("Let's go:");
        int randomNum= (int) (Math.random()*100);
        int[] arr=new int[randomNum];
        int gues= scanner.nextInt();
        int[] userGuess=new int[gues];
        while (true){
            for (int i = 0; i < arr.length; i++) {

            }
        }
    }
}

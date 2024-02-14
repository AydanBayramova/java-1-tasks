package Module0.CharApp.Lesson1.JavaTaskSolution;

import java.util.Scanner;

public class Lesson1TasksSeasonApp {
    public static void main(String[] args) {
        //input
        System.out.println("Enter number of month:");
        int month=new Scanner(System.in).nextInt();

        // 2.process
        String season=month<1 || month>12
                ? "Wrong input!" : (month>=3 && month<=5)
                ? "Spring" : (month>5 && month<=8)
                ? "Summer" : (month>8 && month<=11)
                ? "Autumn" : "Winter";

        //output
        System.out.println(season);

    }
}

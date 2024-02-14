package Module0.CharApp.Lesson1.JavaTaskSolution;

import java.util.Scanner;

public class Lesson1NumberApp {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();

        int sum=0;
        long prod=1;
        for (; num>0; num/=10){
            int remainder=num%10;
            sum+=remainder;
            prod*=remainder;

        }
        System.out.println(sum);
        System.out.println(prod);
    }
}

package Module0.CharApp.Lesson1.Questions;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        double b= scanner.nextInt();
       // System.out.println(add(a,b));
         char c=scanner.next().charAt(0);

    }

    public  static  int add(int a,char c){
        return  a+c;
    }

}

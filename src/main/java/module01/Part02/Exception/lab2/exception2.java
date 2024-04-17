package module01.Part02.Exception.lab2;

import java.util.Scanner;

public class exception2{
    public static void main(String[] args)  {
     try {
         exception2();
     }
     catch (Exception e){
         System.out.println("omg");
     }
    }
    public  static  void exception2() throws Exception{
        Scanner scanner=new Scanner(System.in);
       int num= scanner.nextInt();
       int num2=scanner.nextInt();
      try {
          if (num2==0){
              throw new  ArithmeticException("errororoorroor");
          }
      }finally {
          System.out.println("jihugu");
      }

    }
}


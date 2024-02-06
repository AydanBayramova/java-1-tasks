package EolympTasks.PreModule;

import java.util.Scanner;

public class ReverseOder {
    public static void main(String[] args) {
        long a=new Scanner(System.in).nextInt();
        if (a>0){
            if (a/1000!=0){
                long b=a/1000;
                long c=a%1000;
                long d=c/100;
                long e=c%100;
                long f=e/10;
                long h=f%10;
                System.out.printf(String.valueOf(h),f,d,b);
            }
        }
    }
}

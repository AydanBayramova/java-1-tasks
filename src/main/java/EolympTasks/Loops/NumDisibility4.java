package EolympTasks.Loops;

import java.util.Scanner;

public class NumDisibility4 {
    public static void main(String[] args) {
        int x=new Scanner(System.in).nextInt();
        int rem=x%1000;
        int rem2=rem/100;
        int rem3=rem2%10;
        int rem4=x/1000;
        if (x>999 && x<=9999){
            if (x%rem==0 && x%rem2==0 && x%rem3==0 && rem4==0){
                System.out.println("Yes");
            } else if (rem2==0 && rem3==0 && rem==0) {
                System.out.println("eerror");
            }
            else {
                System.out.println("No");
            }
        }
    }
}

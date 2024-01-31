package EolympTasks.Arrays;

import java.util.Scanner;

public class UseFunctionApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float x= scanner.nextFloat(),y= scanner.nextFloat(), z= scanner.nextFloat();
     float max1=Math.max(x,y);
     float max=Math.max(y,z);
     float res= Math.min(max1,max);
        System.out.println("0.2f"+Math.min(res,x+y+z));

    }
}

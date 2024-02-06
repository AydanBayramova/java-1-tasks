package EolympTasks.PreModule;

import java.util.Scanner;

public class MaxAbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        double maxValue=Double.MIN_VALUE;
        if (a>0 && a<100){
            double[] arr=new double[a];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=scanner.nextDouble();

            }
            for (int i = 0; i < arr.length; i++) {
                if (Math.abs(arr[i])>maxValue){
                   maxValue=Math.abs(arr[i]);
                }
            }
            System.out.printf("%.2f",maxValue);
        }
    }

}

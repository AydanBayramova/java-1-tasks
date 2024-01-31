package EolympTasks.Arrays;

import java.util.Scanner;

public class UseFunctionApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      double[] arr=new double[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextDouble();
        }
        System.out.println(Math.min(Math.min(Math.min(arr[0],arr[1]),Math.max(arr[1],arr[2])),(arr[0]+arr[1]+arr[2])));
    }
}

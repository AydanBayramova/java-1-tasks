package EolympTasks.PreModule;

import java.util.Scanner;

public class ArraysApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int i;
        if (n>=0 && n<=100){
            int[] arr=new int[n];
            for (i = 0; i < arr.length; i++) {
                arr[i]= scanner.nextInt();
            }
            if (arr[i]<2.5){
                System.out.println((i+1)+" "+arr[i]);
            }
        }
    }
}

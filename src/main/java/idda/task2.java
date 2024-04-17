package idda;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       if (n>=1 && n<=Math.pow(10,6)){
           int[] array = new int[n];
           for (int i = 0; i < n; i++) {
               array[i] = in.nextInt();
           }
           int swapCount = 0;
           for (int i = 0; i < array.length - 1; i++) {
               for (int j = 0; j < array.length - i - 1; j++) {
                   if (array[j] > array[j + 1]) {
                       int temp = array[j];
                       array[j] = array[j + 1];
                       array[j + 1] = temp;
                       swapCount++;
                   }
               }
           }
           System.out.println(swapCount);
       }
    }
}

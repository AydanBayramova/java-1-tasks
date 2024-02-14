package module01.lessson1;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]={22,33,44,14};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i]);
            }
        }
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
             if (   arr[j]>arr[i]){
                 arr[i]=arr[j];
                 temp=arr[i];
             }
            }
        }
        System.out.println(temp);
    }
}

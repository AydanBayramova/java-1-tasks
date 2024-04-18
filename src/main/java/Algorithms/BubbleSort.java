package Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[]={3,1,5,4,10,8};
       bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public  static void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length-1 ; i++) {
            boolean sorted=true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j]> arr[j+1]){
                    int target=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=target;
                    sorted=false;
                }
            }
            if (sorted){
                return;
            }
        }
    }
}

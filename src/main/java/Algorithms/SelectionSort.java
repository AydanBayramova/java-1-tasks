package Algorithms;

import module01.Examing.Abstarc;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int array[]={76,42,12,55,33};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
    public  static  void selectionSort(int arr[]){
       int minIndex=0;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;


        }


    }
}

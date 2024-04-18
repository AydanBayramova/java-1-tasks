package Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int array[] = {6, 1, 99, 7, 5, 3, 4};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int midIndex = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, midIndex);
        int[] rightArray = Arrays.copyOfRange(array, midIndex, array.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from leftArray
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements from rightArray
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

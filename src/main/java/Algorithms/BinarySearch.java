package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {2, 5, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        System.out.println(binarySearch(array, 15));
    }

    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] > target) { //ignore right
                right = middle - 1;
            } else {
                left = middle + 1;    //ignore left
            }

            if (left > right) {
                return -1;
            }
        }
        return -1;
    }
}

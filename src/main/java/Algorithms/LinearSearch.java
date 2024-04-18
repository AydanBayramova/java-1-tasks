package Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int array[]={2,8,9,8,20};
        System.out.println(linearSearch(array, 2));
    }
    public static  int linearSearch(int arr[],int target){
        for (int i = 0; i < arr[i]; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

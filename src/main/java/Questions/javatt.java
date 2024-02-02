package Questions;

public class javatt {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        int[] arr3=arr1;
        arr2[1]=5;
        arr3[1]=4;
        System.out.println(arr1[1]);
    }
}

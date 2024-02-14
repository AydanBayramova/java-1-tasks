package Module0.CharApp.Lesson1.Questions.arrays;

public class arrays5 {
    public static void main(String[] args) {
        int arr[]={1,2,34,5};
        int arr1[]=arr.clone();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(arr1[i]);
        }
        System.out.println(arr==arr1);
    }
}

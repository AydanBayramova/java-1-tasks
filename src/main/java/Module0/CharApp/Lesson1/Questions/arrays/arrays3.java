package Module0.CharApp.Lesson1.Questions.arrays;

public class arrays3 {
    public static void main(String[] args) {
        int arr[]=get();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] get(){
      int arr[]= new  int[]{1,2,3};
        return arr;
    }
}

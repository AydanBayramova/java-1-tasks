package Module0.CharApp.Lesson1.Questions.arrays;

public class Arays2 {
    public static void main(String[] args) {
        int a[]={4,3,7};
        min(a);
    }
    public  static  void min(int[] arr ){
      int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);

    }
}

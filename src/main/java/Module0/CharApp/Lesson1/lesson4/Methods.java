package Module0.CharApp.Lesson1.lesson4;

public class Methods {
    public static void main(String[] args) {
        PrintArray(new int[]{-1,-2,-3,-4});
        int random=(int) ( Math.random()*100);
        for (int i = 0; i < 3; i++) {

        }
    }

    public static void PrintArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + "->" + nums[i]);
        }
    }
}

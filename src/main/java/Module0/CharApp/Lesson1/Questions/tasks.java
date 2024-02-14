package Module0.CharApp.Lesson1.Questions;

public class tasks {
    public static void main(String[] args) {

       int[] arr1=new int[4];
        for (int i = 0; i < 3; i++) {
            for (int arrIndex = 0; arrIndex < 4; arrIndex++) {
                arr1[arrIndex]=(int)(Math.random()*100);
            }
            PrintArray(arr1);
        }
//       printArr(new long[]{1, 2, 3});
//       double a=printPower(2,3);
//        System.out.println(a);
    }
//    public static void printArr(long []arr){
//        System.out.println(Arrays.toString(arr));
//    }
//    public static  double printPower(int num,int pow){
//        return Math.pow(num,pow);
//    }
    public static void PrintArray(int[] arr){
        System.out.println("==============");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"==>"+arr[i]);
        }
    }
}

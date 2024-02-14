package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleSideApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int arr[]=new  int[3];
        for (int i = 0; i < 3; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
     if (Math.pow(arr[0],2)+Math.pow(arr[1],2)==Math.pow(arr[2],2)){
         System.out.println("YES");
     }
     else {
         System.out.println("NO");
     }
    }
}

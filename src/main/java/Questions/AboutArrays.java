package Questions;

import java.util.Scanner;

public class AboutArrays {
    public static void main(String[] args) {
       // int[] exam=new int[0];
       // System.out.println(exam.length);
       // exam[0]=2;
        // System.out.println(exam[0]);
       // int[] exam1=new int[Integer.parseInt(null)];
       // System.out.println(exam1[0]);
       // System.out.println(exam1.length);
       //  int [] exam3=new int[1];
//        int[] smallArr = new int[4];
//        int[] exam3=smallArr;
//        System.out.println(exam3.length);
//       int exam4[]=new int[3];
//       int[][] exam5= {{1, 2}, {3, 4}, {5, 7},{6,7,7}};
//        System.out.println(exam5[3][2]);
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int[] array=new int[a];

        for (int i = 0; i <array.length ; i++) {
            int c=scanner.nextInt();
            System.out.println(array[c]);
        }

    }
}

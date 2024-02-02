package EolympTasks.PreModule;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println((int)(Math.pow(a,2)+Math.pow(b,2)));
    }
}

package EolympTasks.PreModule;

import java.util.Scanner;

public class Increase2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();

        for (int i = 0; i < t; i++) {
            if (t>0){
                t=t+2;
            }
            System.out.println(t);
        }

    }
}

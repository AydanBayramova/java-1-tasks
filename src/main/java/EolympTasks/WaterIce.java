package EolympTasks;

import java.util.Scanner;

public class WaterIce {
    public static void main(String[] args) {
        int t = new Scanner(System.in).nextInt();
        if (t > 0) {
            System.out.println("Water");
        } else if (t <= 0) {
            System.out.println("Ice");
        }


    }
}

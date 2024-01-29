package EolympTasks.Loops;

import java.util.Scanner;

public class EachCondition {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n%3==0 && n%2==0 && n / 100 == 0 && n / 10 != 0) {
            System.out.println("YES");
            } else {
                System.out.println("NO");
            }

    }
}

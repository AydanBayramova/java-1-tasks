package EolympTasks;

import java.util.Scanner;

public class EachCondition {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if ((n > 9 && n < 100) || (n < -9 && n > -100)) {
            if (n % 6 == 0) {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }
}

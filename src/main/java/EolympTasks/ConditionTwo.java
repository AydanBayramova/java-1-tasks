package EolympTasks;

import java.util.Scanner;

public class ConditionTwo {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n % 2 != 0 || (n > 0 && n >= 100 && n <= 999)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

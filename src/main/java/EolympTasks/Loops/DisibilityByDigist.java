package EolympTasks.Loops;

import java.util.Scanner;

public class DisibilityByDigist {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int first = n % 10;
        int second = (n / 10) % 10;
        int third = (n / 100) % 10;
        int fourth = n / 1000;
        if (n > 999 && n <= 9999) {
            if (first == 0 || second == 0 || third == 0 || fourth == 0) {
                System.out.println("NO");
            } else if (n % first == 0 && n % second == 0 && n % third == 0 && n % fourth == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

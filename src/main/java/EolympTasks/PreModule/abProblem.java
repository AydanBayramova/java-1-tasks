package EolympTasks.PreModule;

import java.util.Scanner;

public class abProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = Math.abs(a) + Math.abs(b);
            System.out.println(result);
        }



    }
}

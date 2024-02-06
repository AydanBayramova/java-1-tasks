package EolympTasks.PreModule;

import java.util.Scanner;

public class ValueOfVariable1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        System.out.printf("%.3f", Math.pow(x, 3) - 5 * Math.pow(x, 2) / 7 + 9 * x - 3 / x + 1);
    }
}

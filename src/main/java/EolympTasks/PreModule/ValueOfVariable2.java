package EolympTasks.PreModule;

import java.util.Scanner;

public class ValueOfVariable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        System.out.printf("%.3f", x - (Math.pow(x, 2) + 4) / 2 + Math.pow(x, 3) - 3 / (x + 7));
    }
}

package EolympTasks.PreModule;

import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (scanner.hasNext()){
           double x = scanner.nextDouble();
           System.out.printf("%.4f\n", Math.sqrt(x) + (2 * x) + Math.sin(x));
       }
    }
}

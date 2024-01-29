package EolympTasks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Medium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();

        }
        Arrays.sort(array);
        int med = array[1];
        System.out.println(med);

    }
}

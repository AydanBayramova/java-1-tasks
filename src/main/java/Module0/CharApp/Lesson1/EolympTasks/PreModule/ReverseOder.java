package Module0.CharApp.Lesson1.EolympTasks.PreModule;

import java.util.Scanner;

public class ReverseOder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        System.out.println(reversed);
    }
}

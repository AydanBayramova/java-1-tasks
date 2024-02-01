package EolympTasks.PreModule;

import java.util.Scanner;

public class DollarsBank {
    public static void main(String[] args) {
        int money = new Scanner(System.in).nextInt();


        int age;
        for (age = 0; ; age++) {
            money = money * 2 + age;
            System.out.println(age);
        }
    }
}

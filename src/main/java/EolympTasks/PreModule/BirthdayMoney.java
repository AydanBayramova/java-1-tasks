package EolympTasks.PreModule;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BirthdayMoney {
    public static void main(String[] args) {
        int S = new Scanner(System.in).nextInt();
        int N = findBirthday(S);
        System.out.println(N);
    }

    public static int findBirthday(int S) {
        int year = 1;
        int total = 0;
        while (total < S) {
            total = calculateTotalGift(year);
            year++;
        }
        return year ;
    }

    public static int calculateTotalGift(int year) {
        int total = 0;
        for (int i = 0; i <= year; i++) {
            total = total * 2 + i;
        }
        return total;
    }
}

package module01.Part02.generics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Random random=new Random();
        int number= random.nextInt(9)+1;
        int arrayNum[]=new int[number];
        for (int i = 0; i < number; i++) {
            arrayNum[i]=random.nextInt(100);

        }
        for (int i = 0; i < number; i++) {
            System.out.println(arrayNum[i]);

        }
        for (int i = 0; i < number; i++) {
            
        }

    }
}

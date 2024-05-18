package module01.Part02.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class stream {
    public static void main(String[] args) {
        int array[]={2,4,5,6,7};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int num:array) {
            System.out.println(num);
        }
        Arrays.stream(array).forEach(System.out::println);
       int sum= Arrays.stream(array).filter(num -> num%2==0)
                .map(num->num*3)
               // .forEach(num -> System.out.println(num));
                .sum();
        System.out.println(sum);
    }
}

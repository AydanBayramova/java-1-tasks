package FinalExam;

import java.util.Scanner;

import static FinalExam.testMethod.first;

public class Methods {
//    public static void main(String[] args) {
//        testMethod s= new testMethod();
//        System.out.println(s.tall);
//        s=null;
//        System.out.println(s.tall);
//        first();
//    }
public static void main(String[] args) {
    // input
    final Scanner scan = new Scanner(System.in);
    final String line = scan.nextLine();

    // process
    final String reversed = reverse(line);

    // output
    System.out.println(reversed);
}

    private static String reverse(String line) {
        StringBuilder reversed = new StringBuilder();
        for (int i = line.length() - 1; i >= 0; i--) {
            reversed.append(line.charAt(i));
        }
        return reversed.toString();
    }

}

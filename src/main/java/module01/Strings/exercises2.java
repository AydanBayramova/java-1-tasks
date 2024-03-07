package module01.Strings;

import java.util.Scanner;

public class exercises2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int codePoint1=name.codePointAt(0);
        int codePoint2=name.codePointAt(2);
        int codePoint3=name.codePointCount(0,7);
        System.out.println(codePoint1);
        System.out.println(codePoint2);
        System.out.println(codePoint3);
    }
}

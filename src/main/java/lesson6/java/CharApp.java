package lesson6.java;

import java.util.Scanner;

public class CharApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        String surname= scanner.nextLine();
        String gmail=CharsApp(name);
        int nameLength=CharsApp1(surname);
        System.out.println(gmail);
        System.out.println(nameLength);

    }

    public static int CharsApp1(String name){
        return name.length();
    }
    public static String CharsApp(String surname){
        return surname.replace("@"," ");
    }
}

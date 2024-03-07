package module01.lesson9;

import java.util.Scanner;

public class StatusApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();
        status(st);
    }
    public static void status(String st){
        Scanner scanner=new Scanner(System.in);
        if (st=="shipped"){
            System.out.println("you cargo is shipped");
        } else if (st=="cancel") {
            System.out.println("why you cancel you order..?");
            String cancel1=scanner.nextLine();
        } else if (st == "ready") {
            System.out.println("order is ready");
        } else if (st == "rated") {
            System.out.println("write you rated please...");
            int rate=scanner.nextInt();
        }
        else {
            System.out.println("something");
        }
    }
}

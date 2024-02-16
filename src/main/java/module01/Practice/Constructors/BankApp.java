package module01.Practice.Constructors;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome your Bank application:");
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your surname");
        String surname=scanner.nextLine();
        System.out.println("enter your card number");
        int cardnum=scanner.nextInt();
        System.out.println("your salary:");
        long salary= scanner.nextLong();
        Bank user1=new Bank(name,surname,cardnum,salary);
        System.out.println("Choose one of them: 1.-increasing balance 2.-decreasing balance");
        int chosen= scanner.nextInt();
        if (chosen==1){
            System.out.println("enter youu salary");
            long sal1=scanner.nextLong();
            user1.depo(sal1);
        } else if (chosen==2) {
            System.out.println("enter your withdraw:");
            long draw1=scanner.nextLong();
            user1.withdraw(draw1);
        }

        System.out.println(user1.getName()+" "+user1.getSurname()+" "+user1.getCardNum()+" "+user1.getSalary());


    }
}

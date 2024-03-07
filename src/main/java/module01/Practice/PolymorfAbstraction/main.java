package module01.Practice.PolymorfAbstraction;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("you select one of them 1-cat , 2-dog, 3-horse");
        Animal animal;
        int animalNumber= scanner.nextInt();
        if (animalNumber==1){
            animal=new Cat();
            animal.eat();
        } else if (animalNumber==2) {
            animal=new Dog();
            animal.eat();
        } else if (animalNumber==3) {
            animal=new Horse();
            animal.eat();
        }
        else {
            animal=new Animal();
            animal.eat();
        }
    }
}

package module01.Examing;
import static java.lang.Math.*;
import java.util.Scanner;

public class mainExam {
    //int  num=90;
    Animal animal;

    public mainExam(Animal animal) {
        this.animal = animal;
    }
    public  void days(){
        switch (animal){
            case CAT:
                System.out.println("Animal cat");
                break;
            case DOG:
                System.out.println("Animal dog");
                break;
            case BIRD:
                System.out.println("animal bird");
                break;
            case RABBIT:
                System.out.println("Animal rabbit");
                break;
        }
    }
    final int num=9;
    public static void main(String[] args) {

        int num=8;
        Object object=new Child("a","u");
      //  System.out.println(object.toString());
      // object.introduce();
      if (object instanceof Person){
          Student student=(Student) object;
          student.introduce();
      }
      else {
          System.out.println("error");
      }
      //  System.out.println(num);


      Student student2=new Child("yg","tr");
      student2.speak();
      System.out.println(student2 instanceof Person);
        System.out.println(student2 instanceof Child);
        System.out.println(student2 instanceof Object);
        System.out.println(student2 instanceof Person);
       // System.out.println(student2 instanceof Pet);
     //   Object obje = new String("Merhaba");
     //   System.out.println(obje instanceof Student);

//       Animal animal=Animal.CAT;
//        System.out.println(animal);
       // String st=new String("CAT");
     //   mainExam a=new mainExam(Animal.valueOf(st));
     //   a.days();
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println(Math.pow(a,4));

    }
}

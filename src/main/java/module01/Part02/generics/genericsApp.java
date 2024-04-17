package module01.Part02.generics;

public class genericsApp {
    public static void main(String[] args) {
//        Generics generics=new Generics();
//      generics.setA(777);  //generics.setA("7gdgd");
//      String aa= String.valueOf( generics.getA());
//        System.out.println(generics.getA());
//        int b=99;
     //   String c= String.valueOf(b);

        Generics<String> generics=new Generics();
        generics.setA("Aydan");
        Generics<String> generics2=new Generics();
        generics2.setA("Aydan");
        Generics<Integer> generics3=new Generics();
        GenericsMethods genericsMethods=new GenericsMethods();
        System.out.println(genericsMethods.ISEqauals(generics,generics2));
    }
}

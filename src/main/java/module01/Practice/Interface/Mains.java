package module01.Practice.Interface;



public class Mains {
    public static void main(String[] args) {
      RangeRower car1=new RangeRower();
      Mercedes  car2=new Mercedes();
      car1.fly();
      car1.buy();
      flyables(car1);
    //  flyables(car2);
       // System.out.println(car2.customSignal());
      car2.signal();
        System.out.println(car2.sound());

    }
    public static String flyables(Flyable flyingg){
        return flyingg.buy();
    }
}

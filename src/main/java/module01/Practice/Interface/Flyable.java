package module01.Practice.Interface;

public interface Flyable extends SwimAble {
   int age=7;

    default void fly(){
        System.out.println("cars price is flying");
    }
    String buy();
  public  static void b(){
        System.out.println("hdj");
    }
}

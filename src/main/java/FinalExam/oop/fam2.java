package FinalExam.oop;

public abstract interface fam2 {
    public abstract int num();
    public abstract String surname();
    public  static final int NAME = 0;
   public  default void getinfo(){
        return;
    }
    public static void  test(){
        System.out.println("oooo");
    }
static  void show(){
    System.out.println("static");
}
}

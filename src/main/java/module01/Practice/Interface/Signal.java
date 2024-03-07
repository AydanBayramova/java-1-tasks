package module01.Practice.Interface;

public interface Signal {
   // String customSignal();
    default void signal(){
        System.out.println("bippp");
    }
     String sound();
}

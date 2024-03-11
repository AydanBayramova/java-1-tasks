package module01.Examing;

public interface myInterfaes {
     default void display(){
        System.out.println("default");
    }
    static void show(){
        System.out.println("static method");
    }
}

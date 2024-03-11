package module01.Examing;

// Java program to demonstrate scope
// of static method in Interface.

interface PrintDemo {
     void interfaceMethod();

    // Static Method
    static void hello()
    {
        System.out.println("Called from Interface PrintDemo");
    }
    default void interfaceDefault(){
        System.out.println("default method");
    }
}

public class InterfaceDemo implements PrintDemo {

    public static void main(String[] args)
    {

        // Call Interface method as Interface
        // name is preceding with method
        PrintDemo.hello();

        // Call Class static method
      //  hello();
        InterfaceDemo int1=new InterfaceDemo();
        int1.interfaceDefault();
        int1.interfaceMethod();
     //   int1.hello();
      int1.interfaceDefault();

    }

    @Override
    public void interfaceMethod() {
        System.out.println("interfaces method");
    }

    // Class Static method is defined
//    static void hello()
//    {
//        System.out.println("Called from Class");
//    }

//    @Override
//    public void interfaceDefault() {
//    //    PrintDemo.super.interfaceDefault();
//        System.out.println("default interfaces imp");
//    }
}


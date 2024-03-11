package module01.Examing;

public class SubClass extends SuperClass {
    public static void staticMethod() {
        System.out.println("Sub Class static method");
    }

    public static void main(String[] args) {
        SuperClass.staticMethod(); // Sub Class static method
        SubClass.staticMethod(); // Sub Class static method

        SuperClass superClass = new SubClass();
        superClass.staticMethod(); // Super Class static method

        SubClass subClass = new SubClass();
        subClass.staticMethod(); // Sub Class static method
    }
}

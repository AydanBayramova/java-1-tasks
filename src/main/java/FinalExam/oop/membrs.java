package FinalExam.oop;

public abstract class membrs {

   static String name;

    public membrs(String name) {
        this.name = name;
    }

    protected abstract String name();
    public abstract String surname();

    protected  String name2() {
        return null;
    }
    public String test(){
        return "aa";
    }
    public static void  test1(){
        System.out.println("oooo");
    }
}

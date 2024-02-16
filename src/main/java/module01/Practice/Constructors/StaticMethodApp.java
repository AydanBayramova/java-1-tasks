package module01.Practice.Constructors;

public class StaticMethodApp {
    public static void main(String[] args) {
        int c=StaticMethod.sum(2,3);

        System.out.println(c);
      StaticMethod user=new StaticMethod();
        int d=user.sum1(22,3);
        System.out.println(d);
    }
}

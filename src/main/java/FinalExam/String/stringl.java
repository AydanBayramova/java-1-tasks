package FinalExam.String;

public class stringl {
    public static void main(String[] args) {
        String a="j";
        String b="j";
        System.out.println(a==b);
        System.out.println(a.equals(b));
        String c=new String("j");
        System.out.println(a.equals(c));
        String d=new String("j");
        System.out.println(c.equals(d));
        System.out.println(c==d);
        System.out.println(a==d);
        String test="t";
        String test2="a";
        System.out.println(test2.compareTo(test));
        String[] mammals = {"monkey", "chimp", "donkey"};
        int length = mammals.length;
        a.length();
        String str = "123";
        try {
            int num = Integer.parseInt(str);
            System.out.println("Num: " + num); // prints out 123
        } catch (NumberFormatException e) {
            System.out.println("String does not contain a valid integer!");
        }
    }
}

package Module0.CharApp.Lesson1.Questions;

public class Operators {
    public static void main(String[] args) {
        short a=10;
        short b=10;
//a+=b;//a=a+b internally so fine
        a= (short) (a+b);//Compile time error because 10+10=20 now int
        System.out.println(a);
        String aa="AA";
        boolean aaa=aa instanceof String;
        System.out.println(aaa);
    }

}

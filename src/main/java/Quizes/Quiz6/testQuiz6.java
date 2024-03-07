package Quizes.Quiz6;

public class testQuiz6{
    public static void main(String[] args) {
        test test1=new test("aydan");
        test test2=new test("aydan");
        System.out.println(test1.equals(test2));
        System.out.println(test1==test2);
        test test3=test1;
        System.out.println(test3.equals(test1));
        System.out.println(test3==test1);
        String name=new String("aydan");
        String name1=new String("aydan");
        String name3="aydan";
        String name4="aydan";
        System.out.println(name==name1);
        System.out.println(name.equals(name1));
        System.out.println(name3==name4);
        System.out.println(name3.equals(name4));
        int age=25;
        Integer ageObject = new Integer(age);
        Integer ageobject1=Integer.valueOf(age);
        Integer marks=2993;
        int newMarks=marks;
        Integer marks2=476;
        System.out.println(marks2.intValue());


    }
}

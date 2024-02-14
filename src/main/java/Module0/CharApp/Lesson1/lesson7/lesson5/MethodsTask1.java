package Module0.CharApp.Lesson1.lesson7.lesson5;

public class MethodsTask1 {
    public static void main(String[] args) {

        double a = inputDouble(2);
        int b = inputInteger(3);
        System.out.println(a + "  " + b);
    }

    public static double inputDouble(double a) {
        return a + 2;
    }
    public static int inputInteger(int b) {
        return b + 2;
    }
}

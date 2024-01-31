package lesson5;

public class MethodsTask1 {
    public static void main(String[] args) {

        double a = InputDouble(2);
        int b = InputInteger(3);
        System.out.println(a + "  " + b);
    }

    public static double InputDouble(double a) {
        return a + 2;
    }
    public static int InputInteger(int b) {
        return b + 2;
    }
}

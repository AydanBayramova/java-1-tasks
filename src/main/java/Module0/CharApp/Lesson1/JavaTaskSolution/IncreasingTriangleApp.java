package Module0.CharApp.Lesson1.JavaTaskSolution;

public class IncreasingTriangleApp {
    public static void main(String[] args) {
        int size=5;
        for (int i = 0; i < size; i++) {
            // print spaces
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

}
    }
}

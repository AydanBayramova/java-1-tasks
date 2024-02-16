package module01.lesson3;

public class CircleApp {
    public static void main(String[] args) {
        Circle user1 = new Circle(2, "black");
        Circle user2 = new Circle(4, "red");
        Circle user3 = new Circle(1, "red");
        long countofCircles = Circle.countofCircles;
        user1.setColor("red");
       // System.out.println(user1.getColor());
        System.out.println(countofCircles);
    }
}

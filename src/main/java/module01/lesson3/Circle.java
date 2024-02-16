package module01.lesson3;

public class Circle {
    private double radius;
    private String color;
    static long countofCircles;
    private double calcLength;

    public Circle(double radius, String color) {
        countofCircles++;
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getColor() {
        if (color != "white") {

        }

    }



}


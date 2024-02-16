package module01.lesson3;

public class Square {
    private String color;
    private double sides;
    static long countofSquares;

    public Square(String color, double sides) {
        this.color = color;
        this.sides = sides;
        countofSquares++;
    }

    public double calcLength() {
        return 4 * this.sides;
    }

    public double calcSides() {
        return this.sides * this.sides;
    }

    public void setColor(String color) {
        if ("white".equals(color)) {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getSides(double sides) {
        return this.sides;
    }
}

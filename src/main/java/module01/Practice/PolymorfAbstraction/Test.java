package module01.Practice.PolymorfAbstraction;


    // Java program to illustrate the
// concept of Abstraction
    abstract class Shape {
        String color;

        // these are abstract methods
        abstract double area();
        public abstract String toString();

        // abstract class can have the constructor
        public Shape(String color)
        {
            System.out.println("Shape constructor called");
            this.color = color;
        }

        // this is a concrete method
        public String getColor() { return color; }
    }


    public class Test {
        public static void main(String[] args)
        {
            Shape s1 = new Circle("Red", 2.2);
            Shape s2 = new test1("Yellow", 2, 4);

            System.out.println(s1);
            System.out.println(s2);
        }
    }



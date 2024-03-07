package module01.Practice.PolymorfAbstraction;

class test1 extends Shape {

    double length;
    double width;


    public test1(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    public test1(String color) {
        super(color);
    }

    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }
}
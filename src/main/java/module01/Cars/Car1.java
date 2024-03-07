package module01.Cars;

import java.util.Objects;

public abstract class Car1 implements CarCarantile {
    private String mark;
    private  String model;
    private int year;
    private String color;
    private double cost;
    public abstract void type();

    public Car1(String mark, String model, int year, String color, double cost) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car1 car1 = (Car1) o;
        return year == car1.year && Double.compare(car1.cost, cost) == 0 && Objects.equals(mark, car1.mark) && Objects.equals(model, car1.model) && Objects.equals(color, car1.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, year, color, cost);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

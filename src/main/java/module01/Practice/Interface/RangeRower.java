package module01.Practice.Interface;

public class RangeRower extends Car implements Flyable{

public  String year(){
    return "2024";
}
    @Override
    public String start() {
        return "Range Rower is starting";
    }

    @Override
    public String color() {
        return  "Range rower color is blue";
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }

    @Override
    public String buy() {
        return "i buy range rower";
    }

    @Override
    public void swim() {
        System.out.println("dhhf");
    }

    static void b(){
        System.out.println("hdj");
    }
}

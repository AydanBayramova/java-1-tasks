package Quizes.Quiz6;

class Car {
    private String color;
    public Car(String color) {
        this.color = color;
    }
    public String toString() {
        return "color: " + color;
    }}

class Mercedes extends Car{
    private  String model;

    public Mercedes(String color,String model) {
        super(color);
        this.model=model;
    }

    @Override
  public String toString(){
        return "model:"+model+" "+super.toString();
    }


}
public class second {
    public static void main(String[] args) {
        Car car=new Mercedes("black","Mercedes C250");
        System.out.println(car);
    }
}
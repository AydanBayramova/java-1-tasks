package module01.Cars;

public class BenzinliCar extends Car1{
    public BenzinliCar(String mark, String model, int year, String color, double cost) {
        super(mark, model, year, color, cost);
    }

    @Override
    public void type() {
        System.out.println("your car is benzinli");
    }

    @Override
    public void getCaranti() {
        System.out.println("caranti is 2year");
    }
}

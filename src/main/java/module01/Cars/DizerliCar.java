package module01.Cars;

public class DizerliCar extends Car1 {

    public DizerliCar(String mark, String model, int year, String color, double cost) {
        super(mark, model, year, color, cost);
    }

    @Override
    public void type() {
        System.out.println("you car is dizerlicar");
    }

    @Override
    public void getCaranti() {
        System.out.println("you car garanti is 1year");
    }
}

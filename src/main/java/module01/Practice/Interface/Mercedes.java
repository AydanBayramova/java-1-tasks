package module01.Practice.Interface;

public class Mercedes extends Car implements SwimAble,Signal{
    @Override
    public String start() {
        return "Mercedes is run and start";
    }

    @Override
    public String color() {
        return "mercedes color is black";
    }

    @Override
    public void swim() {
        System.out.println("mercedes swim");
    }

    @Override
    public String sound() {
        return "sound";
    }

//    @Override
//    public String customSignal() {
//        return "hey";
//    }

//    @Override
//    public void signal() {
//        Signal.super.signal();
//    }
}

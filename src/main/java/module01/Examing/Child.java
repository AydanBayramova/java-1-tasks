package module01.Examing;



public class Child extends Student {
    public Child( String name, String surname) {
        super( name, surname);
    }

    @Override
    public void speak() {
        System.out.println("hgyugyu");
    }


}

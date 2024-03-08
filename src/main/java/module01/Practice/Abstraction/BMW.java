package module01.Practice.Abstraction;

public class BMW extends Cars {
    public BMW(String name) {
        super(name);
    }

    @Override
    public void fast() {
        System.out.println("most people love BMW");
    }
}

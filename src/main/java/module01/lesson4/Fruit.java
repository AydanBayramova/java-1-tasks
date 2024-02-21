package module01.lesson4;

public class Fruit {
    private String types;

    public Fruit(String types, String species, String name) {

        this.types = types;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }


    public static String eat() {
        return "no eat";
    }
}


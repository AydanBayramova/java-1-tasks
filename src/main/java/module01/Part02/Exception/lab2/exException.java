package module01.Part02.Exception.lab2;

public class exException {
    public static void main(String[] args) {
        try {
            eat();
        } catch (exException1 e) {
            throw new RuntimeException(e);
        }
    }

    public static void eat() throws exException1 {

    }
}

package module01.Examing;


public class Ornek {
   public final static int a = 10;
    public static void main(String[] args) {

        {
            int a = 20;
            System.out.println(a); // 20 yazdırır.
        }
        System.out.println(a); // 10 yazdırır.
    }
}

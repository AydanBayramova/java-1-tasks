package module01.Part02.generics;

import java.util.Random;

public class genericsApp {
    public static void mainV1(String[] args) {
//        Generics generics=new Generics();
//      generics.setA(777);  //generics.setA("7gdgd");
//      String aa= String.valueOf( generics.getA());
//        System.out.println(generics.getA());
//        int b=99;
        //   String c= String.valueOf(b);

        Generics<String> generics = new Generics();
        generics.setA("Aydan");
        Generics<String> generics2 = new Generics();
        generics2.setA("Aydan");
        Generics<Integer> generics3 = new Generics();
        GenericsMethods genericsMethods = new GenericsMethods();
        System.out.println(genericsMethods.ISEqauals(generics, generics2));
    }

    public static void mainV2(String[] args) {
        Random rastgele = new Random(); // Rastgele sayı üreten bir nesne oluşturur
//
//         var rastgeleSayi = rastgele.ints()  // Sonsuz rastgele integer akışı oluşturur
//                .limit(7)     // Akışı en fazla 7 elemanla sınırlar (henüz işlenmez)
//                .skip(3)      // İlk 3 elemanı atlar (henüz işlenmez)
//                .map(e -> {   // Her elemana bir lambda ifadesi uygular
//                    System.out.println("Eşleme!"); // "Eşleme!" mesajını yazdırır
//                    return e;                   // Orijinal elemanı döndürür
//                }).forEach(System.out::println);


        // Akışı işletmek için bir son işlem çağrılmıyor.
    }
}

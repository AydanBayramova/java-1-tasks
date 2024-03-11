package module01.Examing;

import java.time.LocalDate;
import java.util.Date;

public class datening {
    public static void main(String[] args) {
//        LocalDate bugun = LocalDate.now();
//        System.out.println("Başlangıç tarihi: " + bugun); // 2024-03-10
      Date bugun = new  Date();
        System.out.println(bugun);
     System.out.println("Başlangıç tarihi: " + bugun); // 2024-03-10
// Hata: `LocalDate` nesnesi değiştirilemez
// bugun.plusDays(1);

     // LocalDate yarın = bugun.plusDays(1); // Yeni bir nesne oluşturarak tarihi değiştiririz
       //System.out.println("Değiştirilmiş tarih: " + yarın); // 2024-03-11
      //  bugun.plusDays(4); // Hata: UnsupportedOperationException

        //System.out.println("Değiştirilmiş tarih: " + bugun); // Hata: Değiştirilmiş tarih yazdırılamaz
     // Yeni bir nesne oluşturarak tarihi değiştiririz
       // System.out.println("Değiştirilmiş tarih: " + yarın); // 2024-03-11
    }
}

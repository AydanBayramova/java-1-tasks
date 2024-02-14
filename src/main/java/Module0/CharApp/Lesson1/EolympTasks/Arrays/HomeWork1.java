package Module0.CharApp.Lesson1.EolympTasks.Arrays;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oyun başladı:");

        System.out.println("Adınızı girin:");
        String name = scanner.nextLine();

        // 1'den 100'e kadar olan sayıları içeren bir dizi oluştur
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        while (true) {
            // Her döngüde yeni bir rastgele sayı seç
            int randomIndex = (int) (Math.random() * 100+1);
            int randomNumber = array[randomIndex];

            System.out.println("Tahmininizi girin:");
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("Çok az");
            } else if (randomNumber > guess) {
                System.out.println("Çok fazla");
            } else {
                System.out.println("Tebrikler " + name + "! Doğru tahmin!");
                break;
            }
        }

        scanner.close();
    }
}

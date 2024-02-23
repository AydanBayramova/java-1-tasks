package module01.PlaceApp;

import java.util.Random;

public class SeatApp {
    public static void main(String[] args) {
        String[] students = names();
        int[] seats = new int[17];
        assignSeats(students, seats);

        print(students, seats);
    }

    private static void assignSeats(String[] students, int[] seats) {
        Random rand = new Random();
        int remainingSeats = seats.length;

        for (int i = 0; i < students.length; i++) {
            int randomSeat = rand.nextInt(remainingSeats) + 1;
            if (seats[randomSeat - 1] == 0) {
                seats[randomSeat - 1] = i + 1;
                remainingSeats--;
            } else {
                for (int j = randomSeat; j < seats.length; j++) {
                    if (seats[j] == 0) {
                        seats[j] = i + 1;
                        remainingSeats--;
                        break;
                    }
                }
            }
        }
    }

    private static String[] names() {
        return new String[]{
                "Ali", "Aybaniz", "Aydan", "Behruz", "Bashir",
                "Eldar", "Farid H.", "Fariz K.", "Ilham", "Kanan",
                "Nazrin", "Nurlan", "Selen", "Taleh", "Leyla", "Vusal"
        };
    }

    private static void print(String[] students, int[] seats) {
        System.out.println("Student\tSeat");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "\t\t" + seats[i]);
        }
    }
}

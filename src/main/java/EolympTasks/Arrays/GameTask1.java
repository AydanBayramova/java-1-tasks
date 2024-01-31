package EolympTasks.Arrays;

import java.util.Scanner;

public class GameTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int randomIndex = (int) (Math.random() * 100);
        int randomNumber = array[randomIndex];

        int[] guesses = new int[randomNumber];
        int counter = 0;

        while (true) {
            System.out.println("Guess a number between 1 and 100:");
            int guess = scanner.nextInt();


            guesses[counter++] = guess;

            if (guess < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {

                System.out.println("Your guesses until " + randomNumber + ":");
                for (int i = 0; i < counter; i++) {
                    System.out.println(guesses[i]);
                }
                System.out.println("Congratulations, " + name + "! You guessed it right!");
                break;
            }
        }

    }
}

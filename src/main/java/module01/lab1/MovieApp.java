package module01.lab1;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Movie[] movies=new Movie[0];
        Scanner scanner=new Scanner(System.in);
        int numMovies=scanner.nextInt();
        movies=new Movie[numMovies];
        for (int i = 0; i < movies.length; i++) {
            System.out.println("eenter numbers"+i+1);
            movies[i]=names(scanner);
            System.out.println("Movie List:");
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }

    }
    public static Movie names(Scanner scanner){
        System.out.println("enter films names");
        String names=scanner.nextLine();
        double rating=scanner.nextDouble();
        return new Movie(names,rating);
    }
}

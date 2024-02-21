package module01.lab1.java;

import java.util.Scanner;

public class MovieMenu {
    public static void main(String[] args) {
        Movie[] movie=new Movie[0];
        System.out.println("I create my own menu let's start:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose one of them: if you chose 1 you input if choose 2 you see and 3 exit:");
        boolean exit=true;
        while (exit){
            int choose= scanner.nextInt();
            switch (choose){
                case 1:
                    getInput(3,scanner,movie);
                  break;
                case 2:
                    displayMMovie(movie);
                    break;
                case 0:
                    exit=false;
                default:
                    System.out.println("smthing");
            }
        }
    }
    public static  void getInput(int n,Scanner scanner,Movie[] movie){
        n=3;
        Movie[] movie1=new Movie[movie.length+n];
        for (int i = 0; i < movie1.length ; i++) {
            System.out.println("enter of movies"+(i+1));
            String name= scanner.next();
            System.out.println("enter of rating"+(i+1));
            double rating= scanner.nextDouble();
            movie1[i]=new Movie(name,rating);
        }
    }
    public static  void displayMMovie(Movie[] movie) {
        System.out.println("your choose");
        for (Movie movies : movie) {
            System.out.println("movie" + movies.getName() + "rating" + movies.getRating());
        }
    }

}

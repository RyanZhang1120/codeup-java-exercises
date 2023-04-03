package movies;
import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoviesApplication {
    private static List<Movie> movieList;
    public static void main(String[] args) {
        boolean running = true;
        movieList = initializeMovieList();
        while(running) {
            System.out.println("What would you like to do?\n");

            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a new movie\n");

            Input input = new Input();
            int choice = input.getInt( "Enter your choice: ");
            switch (choice){
                case 0:
                    running = false;
                    break;
                case 1:
                    displayMovies(null);
                    break;
                case 2:
                    displayMovies("animated");
                    break;
                case 3:
                    displayMovies("drama");
                    break;
                case 4:
                    displayMovies("horror");
                    break;
                case 5:
                    displayMovies("scifi");
                    break;
                case 6:
                    String newMovieName = input.getString("Enter new movie name: ");
                    String newMovieCategory = input.getString("Enter new movie category: ");
                    addMovie(newMovieName, newMovieCategory);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    public static List<Movie> initializeMovieList() {
        return new ArrayList<>(List.of(MoviesArray.findAll()));
    }
    public static void displayMovies(String category){
        for(Movie movie : movieList) {
            if (category == null || movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void addMovie(String name, String category){
        Movie newMovie = new Movie(name, category);
        movieList.add(newMovie);

        System.out.println("New movie added: " + newMovie.getName() + " -- " + newMovie.getCategory());
    }
}

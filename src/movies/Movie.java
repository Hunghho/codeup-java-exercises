package movies;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " -- " + category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // set new variable for movies array
    public static Movie[] movies;

    public static Scanner sc = new Scanner(System.in);

    // add movie

    public static Movie[] addMovie(Movie[] movies, Movie newMovie){
        Movie[] newArray = Arrays.copyOf(movies, movies.length + 1);
        newArray[newArray.length - 1] = newMovie;
        return newArray;
    }

    // loop through the movies array by category

    public static void userChoice(String category){
        for(Movie movie : movies){
            if(movie.getCategory().equals(category) || category.equals("all")){
                System.out.println(movie);
            }
        }
    }

    // userChoice function

    public static void enterChoice(int userPick){
        if(userPick == 1){
            userChoice("all");
        } else if (userPick == 2) {
            userChoice("animated");
        } else if (userPick == 3) {
            userChoice("drama");
        } else if (userPick == 4) {
            userChoice("horror");
        } else if (userPick == 5) {
            userChoice("scifi");
        } else if (userPick == 6) {
            System.out.println("Enter movie name and category");
            String userEnterMovie = sc.next();
            String userEnterCategory = sc.next();
            movies = addMovie(movies, new Movie(userEnterMovie, userEnterCategory));
        }
    }

    // print menu

    public static void printMenu(){
        System.out.println("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                6 - add a movie""");
        System.out.print("Enter your choice:");
    }
}

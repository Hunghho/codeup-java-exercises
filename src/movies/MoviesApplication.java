package movies;

import java.util.Arrays;
import util.Input;

public class MoviesApplication {
    public static int invalidChoice = -1;
    public static int exitChoice = 0;
    // set new variable for movies array
    private static Movie[] movies;

    // loop through the movies array by category

    public static void userChoice(String category){
        for(Movie movie : movies){
            if(movie.getCategory().equals(category) || category.equals("all")){
                System.out.println(movie);
            }
        }
    }

    // userChoice function

    private static void enterChoice(int userPick){
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
                                
                Enter your choice:
                """);
    }

    public static void main(String[] args) {
        int userPick = invalidChoice;
        Input input = new Input();
        movies = MoviesArray.findAll();
        while(userPick != exitChoice){
            printMenu();
            userPick = input.getInt(0, 5);
            enterChoice(userPick);
        }

    }

}

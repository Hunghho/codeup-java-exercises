package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        int userPick = -1;
        Input input = new Input();
        Movie.movies = MoviesArray.findAll();
        while(userPick != 0){
            Movie.printMenu();
            userPick = input.getInt(0, 6);
            Movie.enterChoice(userPick);
        }

    }

}

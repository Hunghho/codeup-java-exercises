import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuess {
        public static int randoN() {
            Random random = new Random();
            return random.nextInt(100) + 1;

        };
        public static void main(String[] args) throws InterruptedException{
            // New Scanner
            Scanner sc = new Scanner(System.in);
            // Intro to game
            String sentence = """
                Welcome to Hung's java guessing game!!!
                 In this game you will guess a number between 1 to 100.
                 You will have 6 guesses total! Good luck!!!
                \s""";
            // turning sentence to array
            String[] words = sentence.split(" ");
            // delay each word in array to print
            for (String word : words){
                System.out.print(word + " ");
                Thread.sleep(100);
            }

            // Storing random number
            int randomNum = randoN();
            //
            int guessAllow = 6;
            // user enter number
            int userEnter;
            // do/while loop
            System.out.println("Enter a number between 1 to 100");
            do{
                userEnter = sc.nextInt();
                // number of guess decrementing
                guessAllow --;
                if (userEnter == randomNum){
                    System.out.printf("Congratulations!! you guessed correctly, the number is %d", randomNum);
                    break;
                } if (userEnter > randomNum) {
                    System.out.println("LOWER");
                } if (userEnter < randomNum){
                    System.out.println("HIGHER");
                }
            }while(guessAllow != 0);
            // game over if max out guess
            if(guessAllow == 0){
                System.out.println("Sorry you SUCK!");
            };
        }
}

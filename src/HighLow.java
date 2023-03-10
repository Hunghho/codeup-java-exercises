import java.util.Scanner;
import java.util.Random;
public class HighLow {
        public static void main(String[] args) throws InterruptedException{
            // New Scanner
            Scanner sc = new Scanner(System.in);
            // Intro to game
            String sentence = """
                 Enter a number between 1 to 100.
                 You will have 6 guesses total! Good luck!!!
                \s""";
            // turning sentence to array
            String[] words = sentence.split("");
            // delay each word in array to print
            for (String word : words){
                System.out.print(word + " ");
                Thread.sleep(300);
            }

            // Storing random number
            int randomNum = randoN();
            //
            int guessAllow = 6;
            // user enter number
            int userEnter;
            // do/while loop
            do{
                userEnter = sc.nextInt();
                // number of guess decrementing
                guessAllow --;
                if (userEnter == randomNum){
                    System.out.printf("GOOD GUESS! you guessed correctly, the number is %d", randomNum);
                    break;
                } if (userEnter > randomNum) {
                    System.out.println("LOWER");
                } if (userEnter < randomNum) {
                    System.out.println("HIGHER");
                } if (guessAllow == 0){
                    System.out.println("Sorry you SUCK!");
                    break;
                } if (guessAllow == 1){
                    System.out.printf("You have %d life left %n", guessAllow);
                } else {
                    System.out.printf("You have %d lives left %n", guessAllow);
                }

            }while(guessAllow != 0);
        }

    public static int randoN() {
        Random random = new Random();
        return random.nextInt(100) + 1;

    };
}

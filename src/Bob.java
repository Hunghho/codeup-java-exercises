import java.util.Scanner;
public class Bob {
    public static void main(String[] args) throws InterruptedException {

        {
            Scanner scanner = new Scanner(System.in);
            boolean confirmation;
            String userEnter;
            String userInput;
            String sentence = "Conversation with Bob the lackadaisical teenage";
            String[] words = sentence.split(" ");
            do{
                for(String word : words) {
                    System.out.print(word + " ");
                    Thread.sleep(300);
                }
//                System.out.println("Conversation with Bob the lackadaisical teenage");
                userEnter = scanner.nextLine();
                if(userEnter.endsWith("!")){
                    System.out.println("Whoa, chill out!");
                } else if (userEnter.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (userEnter.isEmpty()){
                    System.out.println("Fine. Be that way!");
                } else {
                    System.out.println("Whatever.");
                }
                System.out.println("Continue? [y/N]");
                userInput = scanner.nextLine();
                confirmation = userInput.equals("y");

            }while(confirmation);
        }
    }
}

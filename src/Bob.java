import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);
            boolean confirmation;
            String userEnter;
            String userInput;

            do{
                System.out.println("Conversation with Bob the lackadaisical teenage");
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

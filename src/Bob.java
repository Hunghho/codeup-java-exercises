import java.util.Scanner;
public class Bob {
    public static void main(String[] args) throws InterruptedException {

        {
            Scanner scanner = new Scanner(System.in);
            int conversation = 100;
            String userEnter;
            String userInput;
            String sentence = "Conversation with Bob the lackadaisical teenage";
            String[] words = sentence.split(" ");
                for(String word : words) {
                    System.out.print(word + " ");
                    Thread.sleep(100);
                }

            do{
                conversation --;
//                System.out.println("Conversation with Bob the lackadaisical teenage");
                userEnter = scanner.nextLine();
                if(userEnter.endsWith("!")){
                    System.out.println("Whoa, chill out!");
                } else if (userEnter.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (userEnter.isEmpty()) {
                    System.out.println("Fine. Be that way!");
                } else if (userEnter.startsWith("bye")) {
                    System.out.println("Conversation with Bob has ended");
                    break;
                } else {
                    System.out.println("Whatever.");
                }
            }while(conversation != 0);

            if(conversation == 0){
                System.out.println("Conversation with Bob has ended");
            }
        }
    }
}

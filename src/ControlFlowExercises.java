import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){

//        {
//            int i = 5;
//            while (i < 15) {
//                System.out.println(i);
//                i += 1;
//            }
//        }

//        {
//            long i = 2;
//            do {
//                System.out.println(i);
//                i *= i;
//            }while (i < 1000000);

//        }

//        {
//            for (long i = 2 ; i < 1000000 ; i *= i){
//                System.out.println(i);
//            }
//        }

//          {
//            for (int i = 1 ; i < 101 ; i += 1){
//                if(i % 3 == 0 && i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else if(i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//            }
//          }

//        {
//            Scanner scanner = new Scanner(System.in);
////            scanner.useDelimiter("\n");
//            // Declaration
//            int userEnter;
//            String userInput;
//            boolean confirmation;
//
//            // Prompt
//            do{
//                System.out.println("What number would you like to go up to?");
//                userEnter = scanner.nextInt();
//                System.out.println("Here is your table!");
//                System.out.println("number | squared | cubed\n------ | ------  | ------");
//                for (int i = 1; i <= userEnter ; i += 1){
//                    System.out.println(i + "      | " + (i*i) + "       | " + (i*i*i));
//                }
//                System.out.println("Continue? [y/N] ");
//                userInput = scanner.next();
//                confirmation = userInput.equals("y");
//            }while (confirmation);
//        }

        {
           Scanner scanner = new Scanner(System.in);
           // Declaration
            int userEnter;
            String userInput;
            boolean confirmation;

           // Prompt

            do{
                System.out.println("Enter a numerical grade from 0 - 100");
                userEnter = scanner.nextInt();
                if(userEnter >= 88){
                    System.out.println("A: 100 - 88");
                } else if (userEnter >= 80) {
                    System.out.println("B: 87 - 80");
                } else if (userEnter >= 67) {
                    System.out.println("C: 79 - 67");
                } else if (userEnter >= 60) {
                    System.out.println("D: 66 - 60");
                } else {
                    System.out.println("F: 59 - 0");
                }

                System.out.println("Continue? [y/N]");
                userInput = scanner.next();
                confirmation = userInput.equals("y");
            }while(confirmation);
        }
    }
}

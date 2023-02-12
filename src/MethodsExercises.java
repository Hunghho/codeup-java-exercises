import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(2, 2));
//        System.out.println(multiplication(2, 5));
//        System.out.println(division(5, 5));
//        System.out.println(multiplication(10, 2));
//        getInteger(20, 30);
//        getFactorial();
//        diceRoller();
    }
//
//    public static int addition (int a, int b){
//        return a + b;
//    }
//
//    public static int subtraction (int a, int b){
//        return a - b;
//    }

//    public static int multiplication (int a, int b){
//        int result = a;
//        for(int i = a; i <= b ; i += 1){
//            result *= i;
//        }
//        return result;
//    }
//
//    public static int division (int a, int b){
//        return a / b;
//    }
//
//    // recursion
//
//    public static int multiplication (int a, int b) {
//        if (a == 0 || b == 0){
//            return 0;
//        }
//            return a + multiplication(a, b - 1);
//
//    }
//
//    public static int getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in);
//        int userEnter;
//        System.out.printf("Enter a number between %d and %d ", min, max);
//        userEnter = sc.nextInt();
//        do {
//            if (userEnter > min && userEnter < max){
//                System.out.printf("%d is in range of %d and %d ", userEnter, min, max);
//                break;
//            } else {
//                System.out.printf("%d is not in range of %d and %d%n ", userEnter, min, max);
//            }
//            System.out.println("Enter a different number");
//            userEnter = sc.nextInt();
//        }while(userEnter < min && userEnter > max);
//        return userEnter;
//    }
//
//
//        public static void getFactorial(){
//            Scanner sc = new Scanner(System.in);
//            long userEnter; // user enter
//            boolean confirmation;
//            String userInput;
//
//            do{
//                System.out.println("Enter a number from 1 to 10");
//                userEnter = sc.nextInt();
//                if(userEnter >= 1 && userEnter <= 10){
//                    int i, fact = 1;
//                    for (i = 1 ; i <= userEnter ; i += 1){
//                        fact = fact * i;
//                    }
//                    System.out.printf("Factorial of %d is %d%n ", userEnter, fact);
//
//                } else {
//                    System.out.println("Number is not in range of 1 to 10");
//                }
//
//                System.out.println("Continue? [y/N] ");
//                userInput = sc.next();
//                confirmation = userInput.equals("y");
//
//            }while(confirmation);
//
//        }
//
          public static void diceRoller (){
            Scanner sc = new Scanner(System.in);
            int userEnter; // enter number of sides for the dice

              System.out.println("Enter the number of sides for the dice");
              userEnter = sc.nextInt();

              String choice = "y";
              while (choice.equalsIgnoreCase("y")) {
                  int dice1 = (int)(Math.random() * userEnter) + 1;
                  int dice2 = (int)(Math.random() * userEnter) + 1;

                  System.out.printf("Dice 1: %d%n", dice1);
                  System.out.printf("Dice 2: %d%n", dice2);

                  System.out.println("Roll again? (y/n); ");
                  choice = sc.next();
              }

              System.out.println("Goodbye!");
              sc.close();
          }

}

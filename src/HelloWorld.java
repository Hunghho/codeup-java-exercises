import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        {
            System.out.println("Hello, World!");
            System.out.println("Hello, Everyone!");

        }

        {
            int myFavoriteNumber = 9;
            System.out.println(myFavoriteNumber);
            String myString = "My favorite Number " + myFavoriteNumber;
            System.out.println(myString);
            float myNumber = 3.14F; // casting F to the end of assign value
            System.out.println(myNumber);

        }

        {
            int x = 5;
            System.out.println(x++); // this is iteration increment
            System.out.println(x);
        }

        {
            int x = 5;
            System.out.println(++x); // this is one time increment
            System.out.println(x);
        }

        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter something: ");
            String userInput = scanner.next();

            System.out.println("You entered: --> \"" + userInput + "\" <--");

        }


    }

}

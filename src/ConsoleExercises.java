import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){

        {
            double pi = 3.14159;
            System.out.printf("The value of pi is approximately %.2f %n", pi);
        }

        {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a word: ");
//            int userInput = scanner.nextInt();
//
//            System.out.println("You entered: --> \"" + userInput + "\" <--");
        }

        {
            // Declarations
//            Scanner scanner = new Scanner(System.in);
//            String string1;
//            String string2;
//            String string3;
//            String string4;
//
//            // Prompts
//            System.out.println("Enter three words");
//
//            // Read in values
//            string1 = scanner.next();
//            string2 = scanner.next();
//            string3 = scanner.nextLine(); // to capture white space, and prompt System.out.printLn()
//
//            System.out.println("Write a sentence");
//            string4 = scanner.nextLine();
//
//            System.out.println("Here is what you wrote: ");
//            System.out.println(string1 + " " + string2 + " " + string3 + " and " + string4);

        }

        {
//            // Declaration
//            Scanner scanner = new Scanner(System.in);
//            String str1;
//            String str2;
//            int num3;
//            int num4;
//
//            // Prompts
//            System.out.println("Lets calculate the area and perimeter of Codeup virtual classroom");
//            System.out.println("enter the length");
//            str1 = scanner.nextLine();
//            System.out.println("enter the width");
//            str2 = scanner.nextLine();
//
//            // parse string back to number
//            int num1 = Integer.parseInt(str1);
//            int num2 = Integer.parseInt(str2);
//
//            // Calculation
//            num3 = num1 * num2;
//            num4 = (num1 * 2) + (num2 * 2);
//
//            // Read in Values
//
//            System.out.printf("The area of the virtual class room is: %s sqf, and the perimeter is: %s", num3, num4);

        }
            // Bonus
        {
            // Declaration
            Scanner scanner = new Scanner(System.in);
//            scanner.useDelimiter("\n");
            double num1;
            double num2;
            double num3;
            double num4;
            double num5;
            double num6;

//            // Prompts
            System.out.println("Lets calculate the area and perimeter of Codeup virtual classroom");
            System.out.println("enter the length");
            num1 = scanner.nextInt();
            System.out.println("enter the width");
            num2 = scanner.nextInt();
            System.out.println("enter the height");
            num5 = scanner.nextInt();

//            // parse string back to number
//            int num1 = Integer.parseInt(str1);
//            int num2 = Integer.parseInt(str2);

//            // Calculation
            num3 = num1 * num2;
            num4 = (num1 * 2) + (num2 * 2);
            num6 = num1 * num2 * num5;

//            // Read in Values

            System.out.printf("The area of the virtual class room is: %.2f sqf, and the perimeter is: %.2f", num3, num4);
            System.out.printf(", and the volume is: %.2f", num6);
        }

    }
}

package util;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y")
                || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max) {
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public static int getInt() {
        try{
            return Integer.parseInt(getString("Enter an integer: "));
        }catch(NumberFormatException nfx){
            System.out.println(nfx.getMessage());
            return getInt();
        }catch (Exception nfx){
            System.out.println(nfx.getMessage());
            return 0;
        }
    }

    public static double getDouble(double min, double max) {
        System.out.println("Enter a decimal number between " + min + " and " + max + ":");
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public static double getDouble(String prompt) {
        try{
            return Double.parseDouble(getString(prompt));
        } catch(NumberFormatException nfx){
            System.out.println(nfx.getMessage());
            return getDouble(prompt);
        }
    }

    public static boolean hasNewLine(){
        return scanner.hasNextLine();
    }


}

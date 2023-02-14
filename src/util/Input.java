package util;
import java.util.Scanner;

public class Input {
    private final Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }
    public String getString() {
        return sc.nextLine();
    }

    public Boolean yesNo() {
        System.out.println("Continue? [y/N]");
        String userInput = sc.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d", min, max);
        int userNumber = sc.nextInt();
        if (userNumber < min || userNumber > max) {
            getInt(min, max);
        }
        return userNumber;
    }

    int getInt() {
        return sc.nextInt();
    }

    double getDouble(double min, double max) {
        System.out.printf("Give me a number between %s and %s", min, max);
        double userNum = sc.nextDouble();
        if (userNum < min || userNum > max) {
            userNum = getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble() {
        return sc.nextDouble();
    }

}

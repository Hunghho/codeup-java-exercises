package util;
import java.util.Scanner;

public class Input {
    private final Scanner sc = new Scanner(System.in);
//    public Input(){
//        this.sc = new Scanner(System.in);
//    }
    public String getString() {
        return this.sc.nextLine();
    }

    public Boolean yesNo() {
       if(getString().equalsIgnoreCase("y") || getString().equalsIgnoreCase("yes")){
           return true;
       }else{
           return false;
       }
    }

    public int getInt(int min, int max) {
        int userNumber = getInt();
        if (userNumber < min || userNumber > max) {
            System.out.println("Invalid input");
            userNumber = getInt(min, max);
        }
        return userNumber;
    }

    int getInt() {
        return this.sc.nextInt();
    }

    double getDouble(double min, double max) {
        double userNum = getDouble();
        if (userNum < min || userNum > max) {
            userNum = getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble() {
        return this.sc.nextDouble();
    }

}

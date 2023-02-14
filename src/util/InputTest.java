package util;
import java.util.Scanner;
public class InputTest {
    public static void main(String[] args) {
        Input inputEnter = new Input();
        System.out.println(inputEnter.getString());
        System.out.println(inputEnter.getInt(1, 10));
        System.out.println(inputEnter.getInt());
        System.out.println(inputEnter.getDouble());
        System.out.println(inputEnter.getDouble(1.5, 10.5));
        System.out.println(inputEnter.yesNo());
    }
}

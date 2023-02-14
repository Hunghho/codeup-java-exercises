package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter a radius of the circle");
        Input userInput = new Input();
        double userEnterRadius = userInput.getDouble();
        Circle circle = new Circle(userEnterRadius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("Your circle has a circumference of: %.2f, and an area of: %.2f", circumference, area);
    }
}

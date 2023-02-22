package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {

        double userEnterRadius = Input.getDouble("Enter a radius of the circle");
        Circle circle = new Circle(userEnterRadius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("Your circle has a circumference of: %.2f, and an area of: %.2f", circumference, area);
    }
}

package shapes;

public class ShapeTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape = new Rectangle(5, 4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }


}

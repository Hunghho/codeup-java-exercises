package shapes;

public class Square extends Quadrilateral{

    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(int length) {
        this.length = side;
    }

    @Override
    public void setWidth(int width) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(side, 2);
    }


    //    private int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }

//    @Override
//    public int getArea() {
//        return (int) Math.pow(side, 2);
//    }
//
//    @Override
//    public int getPerimeter() {
//        return side * 4;
//    }
}


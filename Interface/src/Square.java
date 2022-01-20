public class Square implements Shape{
    public final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {

        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
}

public class Circle extends Shape{
    public static final double PI=Math.PI;
    public final double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }
}

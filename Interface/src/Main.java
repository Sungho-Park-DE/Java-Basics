import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.0));
        shapes.add(new Rectagle(3.0, 5.0));
        shapes.add(new Square(4.0));

        for (Shape shape : shapes
        ) {
            System.out.println("Area: "+shape.getArea());
        }
    }
}

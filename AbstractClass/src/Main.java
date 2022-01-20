import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.0));
        shapes.add(new Square(4.0));
        shapes.add(new Rectangle(3.0, 4.0));

        for (Shape shape : shapes
        ) {
            System.out.println("Area: "+shape.getArea());
            System.out.println("Perimether: "+shape.getPerimeter());
        }
        for (Shape shape :shapes) {
            shape.move(3,3);
            System.out.println("Move X: "+shape.getX()+"\nMove Y: "+shape.getY());
        }
    }
}

package Lab.SOLID.LiskovSubstitution.Square;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(16, 5);
        Shape square = new Square(2);

        printShapeArea(rectangle);
        printShapeArea(square);
    }

    private static void printShapeArea(Shape shape) {

        System.out.println(shape.getArea());
    }
}

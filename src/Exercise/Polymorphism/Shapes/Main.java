package Exercise.Polymorphism.Shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2.4, 5.00);
        Shape circle = new Circle(2.18);

        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
    }
}
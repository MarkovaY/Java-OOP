package Lab.Polymorphism.Shapes;

public class Main {
    public static void main(String[] args) {

        Lab.Polymorphism.Shapes.Shape rectangle = new Lab.Polymorphism.Shapes.Rectangle(2.4, 5.00);
        Lab.Polymorphism.Shapes.Shape circle = new Lab.Polymorphism.Shapes.Circle(2.18);

        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
    }
}
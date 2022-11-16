package Exercise.Polymorphism.Shapes;

public interface Shape {
    // According to the assignment condition, this has to be an abstract class with private fields, but since they're not needed, and it only has two abstract methods, I changed it to interface

    Double calculatePerimeter();

    Double calculateArea();

}
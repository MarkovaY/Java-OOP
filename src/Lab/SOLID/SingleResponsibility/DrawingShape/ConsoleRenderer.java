package Lab.SOLID.SingleResponsibility.DrawingShape;

import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.Renderer;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.Shape;

public class ConsoleRenderer implements Renderer {
    @Override
    public void render(Shape shape) {
        System.out.println("Shape with area " + shape.getArea());
    }
}

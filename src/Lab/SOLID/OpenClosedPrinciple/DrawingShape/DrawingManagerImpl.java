package Lab.SOLID.OpenClosedPrinciple.DrawingShape;


import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.DrawingManager;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {

    @Override
    public void draw(Shape shape) {
        System.out.println("Shape with area " + shape.getArea());
    }
}

package Lab.SOLID.OpenClosedPrinciple.DrawingShape;

import Lab.SOLID.SingleResponsibility.DrawingShape.ConsoleRenderer;
import Lab.SOLID.SingleResponsibility.DrawingShape.DrawingManagerImpl;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.DrawingManager;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(17.4);
        Rectangle rectangle = new Rectangle(15, 4);

        DrawingManager drawingManager = new DrawingManagerImpl(new ConsoleRenderer());

        drawingManager.draw(circle);
        drawingManager.draw(rectangle);
    }
}

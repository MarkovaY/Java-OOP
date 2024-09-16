package Lab.SOLID.SingleResponsibility.DrawingShape;


import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.DrawingManager;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.Shape;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(13, 2);
        DrawingManager drawingManager = new DrawingManagerImpl(new ConsoleRenderer());

        drawingManager.draw(shape);
    }
}

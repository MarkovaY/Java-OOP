package Lab.SOLID.OpenClosedPrinciple.DrawingShape;


import Lab.SOLID.OpenClosedPrinciple.DrawingShape.Interfaces.DrawingManager;
import Lab.SOLID.OpenClosedPrinciple.DrawingShape.Interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {


    @Override
    public void draw(Shape shape) {
        if (shape instanceof Circle)
        {
            this.drawCircle((Circle)shape);
        }
            else if (shape instanceof Rectangle)
        {
            this.drawRectangle(((Rectangle)shape));
        }
    }
    public void drawCircle(Circle circle)
    {
        // Draw Circle
    }

    public void drawRectangle(Rectangle rectangle)
    {
        // Draw Rectangle
    }
}

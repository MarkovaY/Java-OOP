package Lab.SOLID.SingleResponsibility.DrawingShape;


import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.DrawingManager;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.Renderer;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {

    private final Renderer renderer;

    public DrawingManagerImpl(Renderer renderer) {
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        renderer.render(shape);
    }
}

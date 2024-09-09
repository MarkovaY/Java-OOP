package Lab.SOLID.SingleResponsibility.DrawingShape;


import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.DrawingManager;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.DrawingRepository;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.Rengerer;
import Lab.SOLID.SingleResponsibility.DrawingShape.Interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {

    private final DrawingRepository drawingRepository;
    private final Rengerer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Rengerer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        shape.draw(this.renderer, this.drawingRepository);
    }
}

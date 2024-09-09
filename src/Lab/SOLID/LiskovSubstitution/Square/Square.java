package Lab.SOLID.LiskovSubstitution.Square;

public class Square implements Shape {

    private double side;

    public Square(int side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Square setSide(double side) {
        this.side = side;
        return this;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}

package Exercise.Encapsulation.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double calculateSurfaceArea() {
        // Surface Area = 2lw + 2lh + 2wh
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }

    public double calculateLateralSurfaceArea() {
        // Lateral Surface Area = 2lh + 2wh
        return (2 * length * height) + (2 * width * height);
    }

    public double calculateVolume() {
        // Volume = lwh
        return length * width * height;
    }

    private void validationOfTheSides(double size, String sideName) {
        // none of the sides can be a negative number or 0
        if (size <= 0) {
            throw new IllegalArgumentException(sideName + " cannot be zero or negative.");
        }
    }

    private void setLength(double length) {

        validationOfTheSides(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        validationOfTheSides(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        validationOfTheSides(height, "Height");
        this.height = height;
    }
}
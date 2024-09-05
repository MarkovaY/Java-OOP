package Lab.WorkingWithAbstraction.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Reading the coordinates of the rectangle
        int bottomLeftX = coordinates[0];
        int bottomLeftY = coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];

        Lab.WorkingWithAbstraction.PointInRectangle.Point bottomLeft = new Lab.WorkingWithAbstraction.PointInRectangle.Point(bottomLeftX, bottomLeftY); // creating bottom left point of the rectangle
        Lab.WorkingWithAbstraction.PointInRectangle.Point topRight = new Lab.WorkingWithAbstraction.PointInRectangle.Point(topRightX, topRightY);       // creating top right point of the rectangle

        Lab.WorkingWithAbstraction.PointInRectangle.Rectangle rectangle = new Lab.WorkingWithAbstraction.PointInRectangle.Rectangle(bottomLeft, topRight); // creating the rectangle

        // Reading the number of points I will receive from the scanner
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            // Reading the coordinates of each point
            int[] coordinatesOfPoints = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int x = coordinatesOfPoints[0];
            int y = coordinatesOfPoints[1];
            //Creating a point from the given coordinates
            Lab.WorkingWithAbstraction.PointInRectangle.Point pointInQuestion = new Lab.WorkingWithAbstraction.PointInRectangle.Point(x, y);
            // Print whether the point is in the initial rectangular, by using the contains method
            System.out.println(rectangle.contains(pointInQuestion));
        }
    }
}
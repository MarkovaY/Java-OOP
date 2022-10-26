package Lab;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Building the upper part of the rhombus - rows = n
        printUpperPart(n);

        // Building the middle part - n = stars + space count
        printMiddlePart(n);

        //Building the lower part
        printLowerPart(n);

    }

    private static void printLowerPart(int n) {
        for (int row = n - 1; row >= 1; row--) {
            printRow(n, row);
        }
    }

    private static void printMiddlePart(int n) {
        for (int star = 1; star <= n; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printUpperPart(int n) {
        for (int row = 1; row <= n - 1; row++) {
            printRow(n, row);
        }
    }

    private static void printRow(int n, int row) {

        // Printing the first part of spaces
        for (int space = 1; space <= n - row; space++) {
            System.out.print(" ");
        }
        //Printing the stars
        for (int star = 1; star <= row; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
package Lab.ExceptionsAndErrorHandling.SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Write a program that reads an integer number and calculates and prints its square root (with 2 digits after the decimal point).
//        If the number is invalid, print "Invalid number".
//        In all cases finally, print "Goodbye". Use try-catch-finally.

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try{
            double result = sqrt(input);
            System.out.printf("%.2f%n", result);
        } catch(IllegalArgumentException ignored){
            System.out.println("Invalid number");
        } finally {
            System.out.println("Goodbye");
        }

    }

    private static double sqrt(String input) {

        int number = Integer.parseInt(input);

        if(number < 0){
            throw new IllegalArgumentException("Invalid number");
        }

        return Math.sqrt(number);
    }
}

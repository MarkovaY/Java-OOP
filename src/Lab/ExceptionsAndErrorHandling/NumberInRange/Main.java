package Lab.ExceptionsAndErrorHandling.NumberInRange;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Write a program to enter an integer in a certain range.
//        Until the number is not valid, enter a new number from the console.
//        When the number is valid - end the program.

        Scanner scanner = new Scanner(System.in);

//          Read a range - two numbers, separated by a space.
        int[] range = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

//        	Print the range in the following format: "Range: [{startIndex}...{endIndex}]".
        System.out.println("Range: ["+ range[0] + "..." + range[1] + "]");

        boolean isValidInput = false;

//        	On the next line, read the String.
        while(!isValidInput) {

            String nextInput = scanner.nextLine();

            Optional<Integer> number = Optional.empty();

            try{
                number = Optional.of(Integer.parseInt(nextInput));
            } catch(NumberFormatException ignored){
            }

//          When an invalid number is entered, String or the number is out of range, print "Invalid number: {num}".
            String output = "Invalid number: " + nextInput;

//        	When the entered number is valid, print "Valid number: {num}".
            if(number.isPresent() && isInRange(range, number.get())){
                output = "Valid number: " + number.get();
                isValidInput = true;
            }

            System.out.println(output);
        }
    }

    private static boolean isInRange(int[] range, int number) {
        return number >= range[0] && number <= range[1];
    }
}

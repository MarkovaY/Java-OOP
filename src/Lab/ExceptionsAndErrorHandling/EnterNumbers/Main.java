package Lab.ExceptionsAndErrorHandling.EnterNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Write a method readNumber(int start, int end) that enters an integer number in a given range (start…end), excluding the numbers start and end.
//        If an invalid number or a non-number text is entered, the method should throw an exception.
//        Using this method, write a program that enters 10 numbers: a1, a2, … a10, such that 1 < a1 < … < a10 < 100.
//        If the user enters an invalid number, continue while there are 10 valid numbers entered.
//        Print the array elements, separated with comma and space ", ".

        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;

        List<Integer> numbersInRange = new ArrayList<>();

        while(numbersInRange.size() < 10){

            try{
                start = readNumber(start, end, scanner);
            } catch(NumberFormatException ignored){
                System.out.println();
            }

            numbersInRange.add(start);
        }

    }

    public static int readNumber(int start, int end, Scanner scanner) {

        int number = Integer.parseInt(scanner.nextLine());

        if(!(start < number && number < end)){
//          When the entered input holds an integer that is out of range, print "Your number is not in range {currentNumber} - 100!".
            throw new IllegalStateException("Your number is not in range" + start + " - 100!");
        }

        return number;
    }
}

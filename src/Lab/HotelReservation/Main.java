package Lab.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        String[] input = scanner.nextLine().split("\\s+");
        // Breaking the input to pieces
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2]);
        DiscountType discountType = DiscountType.valueOf(input[3]);


        //Printing the result
        double holidayPrice = PriceCalculator.calculateTotalPrice(pricePerDay, numberOfDays, season, discountType);
        System.out.printf("%.2f", holidayPrice);
    }
}
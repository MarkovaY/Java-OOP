package Lab.WorkingWithAbstraction.HotelReservation;

public class PriceCalculator {

    public static double calculateTotalPrice(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {

        // Calculating the price without discount
        double totalPrice = pricePerDay * numberOfDays * season.getMultiplier();

        // Adding the discount, if any
        totalPrice = totalPrice - (totalPrice * (discountType.getPercent() / 100));

        return totalPrice;
    }
}

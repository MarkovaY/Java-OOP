package Lab.InterfacesAndAbstraction.CarShopExtended;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String country, Integer minRentPerDay, Double pricePerDay) {
        super(model, color, horsePower, country);
        this.minRentDay = minRentPerDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(System.lineSeparator()).append(String.format("Minimum rental period of %d days. Price per day %f", minRentDay, pricePerDay));
        return stringBuilder.toString();
    }
}
package Lab.InterfacesAndAbstraction.CarShopExtended;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String country, Double price) {
        super(model, color, horsePower, country);

        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(System.lineSeparator()).append(String.format("%s sells for %f", getModel(), price));
        return stringBuilder.toString();
    }
}
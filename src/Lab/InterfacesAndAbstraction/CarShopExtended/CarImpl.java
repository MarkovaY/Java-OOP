package Lab.InterfacesAndAbstraction.CarShopExtended;

public abstract class CarImpl implements Car{
    private String model;
    private String color;
    private Integer horsePower;
    private String country;

    protected CarImpl(String model, String color, Integer horsePower, String country) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.country = country;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String getCountryProduced() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", model, country, Car.TIRES);
    }
}
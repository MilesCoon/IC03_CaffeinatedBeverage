import java.util.Objects;

public abstract class CaffeinatedBeverage {

    // Initializing protected fields: Name of drink, Ounces in drink, and Price of drink
    protected String name;
    protected int ounces;
    protected double price;

    protected CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    // Getters and Setters for name, ounces, and price
    public java.lang.String getName() {
        return name;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }
    public double getOunces() {
        return ounces;
    }
    public void setOunces(int ounces) {
        this.ounces = ounces;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return Double.compare(ounces, that.ounces) == 0 && Double.compare(price, that.price) == 0 && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, ounces, price);
    }
}

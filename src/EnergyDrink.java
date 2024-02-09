import java.text.NumberFormat;
import java.util.Objects;

public class EnergyDrink extends CaffeinatedBeverage {
    // Initializing flavor
    private String flavor;

    // Constructor
    public EnergyDrink(String name, int ounces, double price, String flavor) {
        super(name, ounces, price);
        this.flavor = flavor;
    }

    public EnergyDrink() {
        this("NA", 0, 0.0, "NA");
    }

    // Getter and Setter
    public String getFlavor() { return flavor; }
    public void setFlavor(String flavor) { this.flavor = flavor; }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EnergyDrink that = (EnergyDrink) o;
        return Objects.equals(flavor, that.flavor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flavor);
    }

    // toString

    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return "EnergyDrink: " +
                name + ", " +
                ounces + " oz, " +
                flavor + ", " +
                currency.format(price);
    }
}

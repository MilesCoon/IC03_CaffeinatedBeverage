import java.text.NumberFormat;
import java.util.Objects;

public class Coffee extends CaffeinatedBeverage {
    // Initializing private field roastType
    private String roastType;

    // Constructor
    public Coffee(String name, int ounces, double price, String roastType) {
        super(name, ounces, price);
        this.roastType = roastType;
    }

    // Getter and Setter for Roast Type
    public String getRoastType() { return roastType; }
    public void setRoastType(String roastType) { this.roastType = roastType; }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(roastType, coffee.roastType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), roastType);
    }

    // toString
    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return "Coffee: " +
                name + ", " +
                ounces + "oz, " +
                roastType + "' " +
                currency.format(price);
    }
}

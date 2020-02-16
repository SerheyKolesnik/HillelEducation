package Task11;

public class Fruit {
    private double pricePerKg;
    private int weight;
    private FruitType type;
    private Color color;

    public Fruit(double pricePerKg, int weight, FruitType type, Color color) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.type = type;
        this.color = color;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public FruitType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return String.format("{pricePerKg=%s, weight=%s, type=%s, color=%s}", pricePerKg, weight, type, color);
    }
}

package Task13;

public class Animal {

    protected int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public void move() {
        System.out.println("move");
    }

    public void eat() {
        System.out.println("eat");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                '}';
    }
}

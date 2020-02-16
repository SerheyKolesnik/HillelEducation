package Task13;

public class Dog extends Animal {

    private String color;

    public Dog(int weight, String color) {
        super(weight);
        this.color = color;
    }

    public void bark() {
        System.out.println("gav-gav");
    }

    @Override
    public void move() {
        System.out.println("dog run");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

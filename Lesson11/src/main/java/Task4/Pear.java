package Task4;

public class Pear extends Fruit {

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        double price = 0.8;
        double priceOfFruit = getWeight() * price;
        System.out.println("Цена " + getWeight() + " кг груш равна: " + priceOfFruit);
        return priceOfFruit;
    }
}

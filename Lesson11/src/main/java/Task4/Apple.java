package Task4;

public class Apple extends Fruit {

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        double price = 2.1;
        double priceOfFruit = getWeight() * price;
        System.out.println("Цена " + getWeight() + " кг яблок равна: " + priceOfFruit);
        return priceOfFruit;
    }
}

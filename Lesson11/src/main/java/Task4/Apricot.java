package Task4;

public class Apricot extends Fruit {

    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        double price = 10.21;
        double priceOfFruit = getWeight() * price;
        System.out.println("Цена " + getWeight() + " кг абрикосов равна: " + priceOfFruit);
        return priceOfFruit;
    }
}

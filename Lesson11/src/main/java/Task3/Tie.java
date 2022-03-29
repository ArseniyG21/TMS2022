package Task3;

public class Tie extends Clothes implements IMansClothes {
    public Tie(Main.ClothesSize clothesSize, double price, String color) {
        super(clothesSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук для мужчины");
    }

    @Override
    public void info() {

    }
}

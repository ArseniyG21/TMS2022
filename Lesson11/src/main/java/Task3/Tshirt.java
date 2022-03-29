package Task3;

public class Tshirt extends Clothes implements IMansClothes, IWomansClothes {

    public Tshirt(Main.ClothesSize clothesSize, double price, String color) {
        super(clothesSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка для мужчины");
    }

    @Override
    public void info() {

    }

    @Override
    public void dressWoman() {
        System.out.println("Футболка для женщины");
    }
}

package Task3;

public class Trousers extends Clothes implements IMansClothes, IWomansClothes {
    public Trousers(Main.ClothesSize clothesSize, double price, String color) {
        super(clothesSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны для мужчины");
    }

    @Override
    public void info() {

    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны для женщины");
    }
}

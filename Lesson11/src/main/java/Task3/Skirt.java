package Task3;

public class Skirt extends Clothes implements IWomansClothes {
    public Skirt(Main.ClothesSize clothesSize, double price, String color) {
        super(clothesSize, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка - женская одежда");
    }

    @Override
    public void info() {

    }
}

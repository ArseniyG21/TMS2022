package Task3;

public class Atelier {

    public void dressWoman(Clothes[] clothes1) {
        for (Clothes clothesWoman : clothes1) {
            if (clothesWoman instanceof IWomansClothes) {
                ((IWomansClothes) clothesWoman).dressWoman();
            }
        }
    }

    public void dressMan(Clothes[] clothes1) {
        for (Clothes clothesMan : clothes1) {
            if (clothesMan instanceof IMansClothes) {
                ((IMansClothes) clothesMan).dressMan();
            }
        }
    }
}

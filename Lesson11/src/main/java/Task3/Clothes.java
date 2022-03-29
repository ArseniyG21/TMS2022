package Task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Clothes {
    private Main.ClothesSize clothesSize;
    private double price;
    private String color;


}

package Task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public abstract class Fruit {
    private double weight;

    public abstract double getPrice();

    public final void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }

    public void getPriceOfAllFruits() {
//        for
    }
}

package com.tms.utils.extendes_classes_about_transport.about_ground;

import com.tms.utils.extendes_classes_about_transport.GroundTransport;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Cargo extends GroundTransport {
    private double liftingCapacity;

    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" liftingCapacity: %s , ", liftingCapacity);
    }

    public void load(double load) {
        if (load <= liftingCapacity) {
            System.out.println("Грузовик загружен!");
        } else {
            System.out.println("Нужен грузовик побольше!");
        }
    }
}

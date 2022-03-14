package com.tms.utils.extendes_classes_about_transport;

import com.tms.utils.parent.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder

public abstract class GroundTransport extends Transport {
    private int wheels;
    private int fuelConsumption;

    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" wheels: %d , consumption: %s , ", wheels, fuelConsumption);
    }
}

package com.tms.utils.parent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder

public abstract class Transport {
    private int HorsePower;
    private int maxSpeed;
    private int weight;
    private String brand;
    private double powerKilowatts;


    public double powerKilowatts() {
        powerKilowatts = HorsePower * 0.74;
        return powerKilowatts;
    }

    public void displayInfo() {
        System.out.printf("HorsePower : %d hp, maxSpeed: %s km/h, weight: %s kg, brand: %s , powerKilowatts: %.2f kw",
                HorsePower, maxSpeed, weight, brand, powerKilowatts);
    }

}

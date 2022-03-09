package com.tms.utils.extendes_classes_about_transport.about_ground;

import com.tms.utils.extendes_classes_about_transport.GroundTransport;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class PassengerTransport extends GroundTransport {
    private String carcase;
    private int passenger;

    private double distance;

    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" carcase: %s , passenger: %d , ", carcase, passenger);
    }

    public void getDistance(double hours) {
        double distance = getMaxSpeed() * hours;
        this.distance = distance;
        System.out.printf(" За время %.1f ч, автомобиль " + super.getBrand() +
                " двигаясь с максимальной скоростью " + super.getMaxSpeed() + " км/ч " +
                " проедет %.2f км и израсходует " + fuel() + " литров топлива.", hours, distance);
    }

    private double fuel() {
        return distance / 100;
    }
}

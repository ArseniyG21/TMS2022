package com.tms.utils.extendes_classes_about_transport.about_air;

import com.tms.utils.extendes_classes_about_transport.Air;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder

public class CivilAirTransport extends Air {
    private int passengers;
    private boolean businessClass;

    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" passengers: %d , businessClass: %b. ", passengers, businessClass);
    }

    public void load(double load) {
        if (load <= passengers) {
            System.out.println("Самолет полон!");
        } else {
            System.out.println("Нужен самолет побольше!");
        }
    }
}

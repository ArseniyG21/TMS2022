package com.tms.utils.extendes_classes_about_transport;

import com.tms.utils.parent.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder

public abstract class Air extends Transport {
    private String wings;
    private double minimalRoadToFly;

    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" wings: %s ,minimalRoadToFly: %s , ", wings, minimalRoadToFly);
    }
}

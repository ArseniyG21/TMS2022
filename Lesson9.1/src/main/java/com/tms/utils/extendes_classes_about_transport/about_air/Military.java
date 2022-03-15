package com.tms.utils.extendes_classes_about_transport.about_air;

import com.tms.utils.extendes_classes_about_transport.Air;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder

public class Military extends Air {
    private boolean ejection;
    private int rocket;
    private int rocketCount;

    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" ejection: %b , rocket: %d. ", ejection, rocket);
    }

    public void strike() {
        this.rocket = rocketCount;
        if (rocketCount > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют!");
        }
    }

    public void isEjection() {
        if (ejection) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У вас нет такой системы!");
        }
    }
}

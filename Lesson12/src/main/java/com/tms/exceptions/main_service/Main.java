package com.tms.exceptions.main_service;

import com.tms.exceptions.model.Car;
import com.tms.exceptions.model.carException;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .brand("BMW")
                .build();

        Car car1 = Car.builder()
                .brand("Mercedes")
                .speed(45)
                .build();
        Car car2 = Car.builder()
                .brand("Audi")
                .build();
        try {
            car.start();
        } catch (com.tms.exceptions.model.carException carException) {
            System.out.println(carException.getMessage());
        }
        try {
            car1.start();
        } catch (carException carException) {
            System.out.println(carException.getMessage());
        }
        try {
            car2.start();
        } catch (carException carException) {
            System.out.println(carException.getMessage());
        }
    }
}

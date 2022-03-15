package com.tms.main_service;

import com.tms.utils.extendes_classes_about_transport.about_air.CivilAirTransport;
import com.tms.utils.extendes_classes_about_transport.about_air.Military;
import com.tms.utils.extendes_classes_about_transport.about_ground.Cargo;
import com.tms.utils.extendes_classes_about_transport.about_ground.PassengerTransport;


public class Main {
    public static void main(String[] args) {
        CivilAirTransport civilAirTransport = CivilAirTransport.builder()
                .HorsePower(90000)
                .maxSpeed(965)
                .weight(247200)
                .brand("Boeing 777")
                .wings("Wings 60m")
                .minimalRoadToFly(2.5)
                .passengers(550)
                .businessClass(true)
                .build();

        civilAirTransport.displayInfo();
        System.out.println();
        civilAirTransport.load(550);

        Military military = Military.builder()
                .HorsePower(670)
                .maxSpeed(150)
                .weight(7000)
                .brand("F-16")
                .wings("30 m")
                .minimalRoadToFly(0.3)
                .ejection(true)
                .build();
        military.displayInfo();
        military.isEjection();
        military.strike();

        Cargo cargo = Cargo.builder()
                .HorsePower(210)
                .maxSpeed(100)
                .weight(3000)
                .brand("MAN")
                .wheels(6)
                .fuelConsumption(20)
                .liftingCapacity(20000)
                .build();
        cargo.displayInfo();
        cargo.load(21000);

        PassengerTransport passengerTransport = PassengerTransport.builder()
                .HorsePower(100)
                .maxSpeed(180)
                .weight(1500)
                .brand("Volkswagen Polo")
                .wheels(4)
                .fuelConsumption(9)
                .carcase("sedan")
                .passenger(5)
                .build();
        passengerTransport.displayInfo();
        System.out.println();
        passengerTransport.getDistance(10);
    }
}

package by.tms.service;

import by.tms.model.Computer;


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i7", "DDR4", "WD Green");
        computer.on();
        computer.onSecond();
        computer.off();
        computer.limit(4);
        System.out.println(computer.toString());
    }
}

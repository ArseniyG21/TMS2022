package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String cpu;
    private String ram;
    private String hdd;
    int maxLimit = 1;
    double limitCount = maxLimit / 2;
    private int ex;
    private int ex1;

    public Computer(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }


    public void on() {
        System.out.println("Внимание! Введите 0 или 1: ");

        Random random = new Random();
        ex = random.nextInt(0, 1);
        Scanner scanner = new Scanner(System.in);
        ex1 = scanner.nextInt();
        limitCount--;
    }

    public void onSecond() {
        if (getEx() != getEx1()) {
            System.out.println("Компьютер сгорел!");
        }
    }

    public void off() {
        if (ex == ex1) {
            System.out.println("Выключение компьютера");
            limitCount--;
        }
    }

    public void limit(int limit) {
        if (limitCount >= limit) {
            System.out.println("Компьютер сгорел");
        }
    }

    public int getEx() {
        return ex;
    }

    public int getEx1() {
        return ex1;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
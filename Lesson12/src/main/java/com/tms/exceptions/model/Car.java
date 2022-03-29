package com.tms.exceptions.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Car {

    /**
     * Домашка.
     * 1) Можно добработать свой авто из предыдущей домашки, а можно заново сделать.
     * Создать собственное исключение.
     * - Создать класс com.tms.model.Car c полями (марка, скорость, цена), конструкторы (с параметрами и default) гетеры-сетеры.
     * Создать метод старт в котором пытаетесь завести автомобиль. В методе старт генерируете случайное число от 0 до 20, если полученное число оказалось четным,
     * то выбрасываете созданное ранее вами исключение и передаете его к месту откуда вызывали метод старт. Если все хорошо и исключение не вылетело,
     * то выводить в консоль сообщение что автомобиль с такой-то маркой завелся.
     * В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете исключение которое может вылететь при старте автомобиля
     */

    private String brand;
    private int speed;
    private double price;

    public void start() throws carException {
        int random = (int) (Math.random() * 20);
        if (random % 2 == 0) {
            throw new carException("Check Engine! " + getBrand());
        } else {
            System.out.println("Автомобиль " + getBrand() + " завелся");
        }
    }

}

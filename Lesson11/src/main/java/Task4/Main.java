package Task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple(2.34);
        Pear pear = new Pear(4.5);
        Apricot apricot = new Apricot(0.532);

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(pear);
        fruits.add(apple);
        fruits.add(apricot);

        for (Fruit fruit : fruits) {
            fruit.getPrice();
            fruit.printManufacturerInfo();
        }
    }
//    * Задача4
//     * Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
//     * Класс Фрукт содержит:
//            * а) переменную вес,
//     * б) метод printManufacturerInfo(){System.out.print("Made in Belarus");} который нельзя изменить в наследнике.
//     * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
//     * Метод должен учитывать вес фрукта(Т.е в зависимости от веса разная цена)
//     * Создать несколько объектов разных классов.
//     * Подсчитать общую стоимость проданных фруктов.
//     * А также общую стоимость отдельно проданных яблок, груш и абрикос.
//     *

    public void getPriceOfAllSoldFruits() {
    }
}

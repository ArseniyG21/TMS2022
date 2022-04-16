package Main;

import Classes.Animal;
import Classes.ClassTVK;
import Utils.Constants;
import Utils.Utils;

import static Classes.Calculator.divide;

public class Main {
    public static void main(String[] args) {
//        1) Список каталога
//         Написать метод который циклически просматривает содержимое заданного каталога и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах.
//         Используем рекурсию.

        Utils.readFiles(Constants.FILE);

        Animal animal = new Animal();
        ClassTVK<String, Animal, Integer> classTVK = new ClassTVK<>("Строка", animal, 4);
        classTVK.getNamesOfClasses();
        System.out.println(divide(238, 10.67890));

    }
}

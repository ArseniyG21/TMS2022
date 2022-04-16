package Classes;

import java.io.Serializable;

//         2) Обобщенный класс с тремя параметрами
//         Создать обобщенный класс с тремя параметрами (T, V, K).
//         Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
//         методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
//         Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (String),
//         V должен реализовать интерфейс Serializable и расширять класс Classes.Animal, K должен расширять класс Number.

public class ClassTVK<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
    private T obj;
    private V obj1;
    private K obj2;

    public ClassTVK(T obj, V obj1, K obj2) {
        this.obj = obj;
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getString() {
        return obj;
    }

    public V getObj() {
        return obj1;
    }

    public K getInteger() {
        return obj2;
    }

    public void getNamesOfClasses() {
        System.out.println(getString().getClass().getName());
        System.out.println(getObj().getClass().getName());
        System.out.println(getInteger().getClass().getName());
    }

}

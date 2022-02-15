package by.my_project.services;

public class User {
    /**
     * 1) Создать класс User для хранения и обработки данных о пользователе.
     * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
     * - Возврата имени и фамилии полностью
     * - Увеличения возраста
     * - Вывода общей информации о пользователе
     * В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
     * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
     * В этом конструкторе сделать вызов другого конструктора этого же класса.
     * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
     */

    public String name;
    public String surname;
    public String sex;
    private int age = 18;

    @Deprecated
    public User(String name, String surname, String sex) {       // Конструктор с параметрами, вместо int age записывается поле класса
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public User() {

    }

    public User(String surname) {
        this.surname = surname;
    }

    public User(String surname, int age) {
        this(surname);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void print() {
        System.out.println(name + " " + surname);
    }

    @Override
    public String toString() {
        return "User{" +
                "name: " + name +
                ", surname: " + surname +
                ", sex: " + sex +
                ", age: " + age +
                '}';
    }


}

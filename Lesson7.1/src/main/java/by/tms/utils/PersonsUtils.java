package by.tms.utils;


import by.tms.modules.Address;
import by.tms.modules.Person;

import java.util.Scanner;


public class PersonsUtils {

    public static Person[] createPersons() {
        Person[] persons = new Person[1];

        int count = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные человека № " + count);

            System.out.println("Введите имя: ");
            String name = scanner.nextLine();

            System.out.println("Введите возраст: ");
            int age = scanner.nextInt();

            System.out.println("Введите пол: ");
            String sex = scanner.next();

            Address address = new Address();

            persons[count] = new Person(name, age, sex, address);
            count++;

        } while (count < persons.length);

        return persons;
    }

    public Person[] peoples = createPersons();

}



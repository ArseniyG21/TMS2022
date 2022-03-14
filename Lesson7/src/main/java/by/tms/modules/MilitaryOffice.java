package by.tms.modules;


import by.tms.utils.Constants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MilitaryOffice {
    private PersonRegistry personRegistry;
    private Person[] peoples;

    public MilitaryOffice(PersonRegistry personRegistry) {
    }
    /*
       Необходимо написать военкомат.
       1) Создаем класс военкомат MilitaryOffice
       2) Создать в классе конструктор MilitaryOffice, который принимает PersonRegistry
       3) PersonRegistry содержит список людей (Person), которые могут быть назначены в армию
       4) Создать класс Человек, которому можно будет передать имя, возраст, пол, адрес(страна, город)
       Военкомат должен уметь:
       а) выявить имена всех людей годовых к военной службе на получение момента времени, которые есть в PersonRegistry
       Нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годовых к службе призывников
       (годными считаем мужчин от 18 до 27 лет, проверяем пол и возраст)
       б) вывести количество годовых призывников в городе Минске.
       в) установить количество призывников от 25 до 27 лет
       г) вывести количество призывников у каждого имени Александра.
       5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль

       */

    public void findRecruitsByCityMinsk() {
        for (Person people : peoples) {
            if (people.getAddress().getCity().equalsIgnoreCase("минск")) {
                System.out.println("Эти люди из Минска: " + people);
            } else {
                System.out.println("Ошибка");
            }
            if (people.getAge() >= Constants.MIN_AGE && people.getAge() <= Constants.MAX_AGE &&
                    people.getSex().equalsIgnoreCase(Constants.MALE)) {
                System.out.println("Призывники: " + people);
            } else {
                System.out.println("Не призывники: " + people);
            }
            if (people.getName().equalsIgnoreCase("Александр")) {
                System.out.println(people);
            }
            if (people.getAge() >= 25 && people.getAge() <= 27) {
                System.out.println("Возраст от 25 до 27: " + people);
            }
        }
    }

//    public boolean filterRecruits() {
//        return person.getAge() >= Constants.MIN_AGE && person.getAge() <= Constants.MAX_AGE && Constants.MALE.equals(person.getSex());
//    }
//
//    public boolean filterMinsk(Person person) {
//        return person.getAddress().getCity().equalsIgnoreCase("Минск");
//    }
//
//    public boolean filterAlexandr(Person person) {
//        return person.getName().equalsIgnoreCase("Александр");
//    }
//
//    public boolean filterAge25_27(Person person) {
//        return person.getAge() >= 25 && person.getAge() <= 27;
//    }
//
//    public void printPersons() {
//        if (findRecruitsByCityMinsk() && filterRecruits() && filterMinsk() && filterAlexandr() && filterAge25_27()) {
//            System.out.println();
//        }
//    }
}

package by.tms.service;

import by.tms.modules.MilitaryOffice;
import by.tms.modules.Person;
import by.tms.modules.PersonRegistry;

import static by.tms.utils.PersonsUtils.createPersons;

public class Main {
    public static void main(String[] args) {
        Person[] persons = createPersons();
        PersonRegistry personRegistry = new PersonRegistry();
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        militaryOffice.findRecruitsByCityMinsk();
    }

}






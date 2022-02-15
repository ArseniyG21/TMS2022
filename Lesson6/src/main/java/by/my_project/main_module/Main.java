package by.my_project.main_module;

import by.my_project.services.User;


public class Main {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("Андрей", "Иванов", "male"); // без параметра age, вернется 0
        user.name = "Василий";
        user.surname = "Иванов";
        user.sex = "male";
        user.setAge(24);
        user.print();
        System.out.println(user);
        user1.print();
        System.out.println(user1);
    }

}


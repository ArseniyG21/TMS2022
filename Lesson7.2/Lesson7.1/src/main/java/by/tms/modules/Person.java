package by.tms.modules;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private String sex;
    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "name= " + name + '\'' +
                ", age= " + age +
                ", sex= " + sex + '\'' +
                ", address: " + address +
                '}';
    }

}
package by.tms.modules;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String country;
    private String city;

    public Address() {
        objectAddress();
    }

    public void objectAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город: ");
        this.country = scanner.nextLine();
        System.out.println("Введите страну:");
        this.city = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

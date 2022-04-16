package by.teachmeskills.jdbc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product1 {
    private int id;
    private String name;
    private String description;
    private double price;
    private int amount;
    boolean isStock;

    public Product1(int id, String name, String description, double price, int amount, boolean isStock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.isStock = isStock;
    }

    public Product1(String name, String description, double price, int amount, boolean isStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.isStock = isStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", isStock=" + isStock +
                '}';
    }
}

package product;

import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private String brand;
    private double price;
    private String description;

    public Product(String code, String name, String brand, double price, String description) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

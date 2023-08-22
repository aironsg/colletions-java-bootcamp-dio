package br.com.devairon.sets.productRegistration;

public class Product {

    private Long cod;
    private String name;
    private double price;
    private int quantity;

    public Product(Long cod, String name, double price, int quantity) {
        this.cod = cod;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

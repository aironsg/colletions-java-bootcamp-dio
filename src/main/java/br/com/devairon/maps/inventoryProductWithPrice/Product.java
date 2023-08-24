package br.com.devairon.maps.inventoryProductWithPrice;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Nome='" + name + '\'' +
                ", Quantidade=" + quantity +
                ", Preço=" + price +
                '}';
    }
}

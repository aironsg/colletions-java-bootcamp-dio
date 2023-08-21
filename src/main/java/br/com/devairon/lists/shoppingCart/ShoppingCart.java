package br.com.devairon.lists.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList;

    public ShoppingCart(List<Product> productList) {
        this.productList = productList;
    }

    void addProductShoppingCart(String name, double price, int quantity){
        Product product = new Product(name, price, quantity);
        this.productList.add(product);
    }

    void removeProductShoppingCart(String name, double price, int quantity){
        List<Product> removeProduct = new ArrayList<>();
        Product product = new Product(name, price, quantity);
        for (Product itemList: productList) {
            //if(itemList.getName().equals(product.getName())){
            if(itemList.toString().equals(product.toString())){
                removeProduct.add(itemList);
            }
        }

        productList.removeAll(removeProduct);
    }

    double valueTotalShoppingCart(){
        double total = 0;
        for (Product product: productList) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    void displayProduct(){
        for (Product product: productList) {
            System.out.println("----PRODUTO----");

            System.out.println("Nome:" + product.getName());
            System.out.println("Preço:R$" + product.getPrice());
            System.out.println("Quantidade:" + product.getQuantity());
            System.out.println("----------------");
        }
        System.out.println("Total Carrinho:R$" + valueTotalShoppingCart());
    }


}

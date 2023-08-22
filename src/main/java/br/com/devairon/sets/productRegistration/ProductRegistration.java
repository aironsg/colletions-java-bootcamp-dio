package br.com.devairon.sets.productRegistration;

import java.util.HashSet;
import java.util.Set;

public class ProductRegistration {

    Set<Product> products = new HashSet<>();

    public ProductRegistration(Set<Product> products) {
        this.products = products;
    }

    public void addProduct(Long cod, String name, double price, int quantity){
        //TODO Adiciona um produto ao cadastro.
    }

    public void displayProductByName(){
        //TODO Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
    }

    public void displayProductByPrice(){
        //TODO Exibe todos os produtos do cadastro em ordem crescente de preço.
    }


}

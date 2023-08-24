package br.com.devairon.maps.inventoryProductWithPrice;

import java.util.HashMap;
import java.util.Map;

public class InvetoryProduct {
    private Map<Long, Product> productMap;

    public InvetoryProduct() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(Long cod, String name, int quantity, double price){
        //TODO Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
    }

    public void displayProduct(){
        //TODO Exibe todos os produtos, suas quantidades em estoque e preços.

    }

    public Double calcVakueTotalInventory(){
        //TODO Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
        return 0.0;
    }

    public Product getProductExpensivePrice(){
        //TODO Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
        return null;
    }

    public Product getProductCheaperPrice(){
        //TODO  Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
        return null;
    }

    public Product getProductWithgreaterQuantityandTotalValueinStock(){
        //TODO Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
        return null;
    }


}

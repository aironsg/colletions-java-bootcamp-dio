package br.com.devairon.lists.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class MainShoppingCart {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        ShoppingCart shoppingCart = new ShoppingCart(productList);
        shoppingCart.addProductShoppingCart("notebook", 5000, 2);
        shoppingCart.addProductShoppingCart("notebook", 12000, 2);
        shoppingCart.addProductShoppingCart("celular", 2000, 2);
        shoppingCart.addProductShoppingCart("tv", 3000, 2);
        shoppingCart.addProductShoppingCart("oculos de sol", 50, 2);
        shoppingCart.addProductShoppingCart("oculos", 500, 2);


        shoppingCart.removeProductShoppingCart("oculos", 50, 2);

        shoppingCart.displayProduct();

    }
}

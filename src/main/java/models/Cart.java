package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> cartList = new ArrayList<>();
    Double amount = 0.0;
    private static Cart instance = null;

    public List<Product> getCartList() {
        return cartList;
    }

    public Double getAmount() {
        return amount;
    }

    public String addToCart(Product product) {
        cartList.add(product);
        amount += product.amount;
        System.out.println("Product " + product.getBrand() +  " with brand " + product.getProductName() + " added to the cart");
        return "Product item added";
    }


    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }
}

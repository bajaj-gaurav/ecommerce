package core;

import java.util.List;

public class Notification {

    public static String notifyByEmail(Double amount, List<Product> productToCheckOut) {
        System.out.println("Notification mail content");
        System.out.println("Payment for amount is done: " + amount);
        System.out.println("Product list");
        for (Product boughtProduct: productToCheckOut) {
            System.out.println(boughtProduct.getProductName());
        }
        //System.out.println("The user has been notified");
        return "The user has been notified";
    }
}

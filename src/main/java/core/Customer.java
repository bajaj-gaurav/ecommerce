package core;

import java.util.List;

public class Customer extends User{

    Cart cart;

    public Customer() {
        this.cart = Cart.getInstance();
    }

    public void addToCart(String brand, String product) {
        Double getAmountFromDatabase = 1000.0;
        cart.addToCart(new Product(brand, product, getAmountFromDatabase));
    }

    public void checkOut() {
        System.out.println("Starting the checkout process");
        List<Product> productToCheckOut = cart.getCartList();
        Double amount = cart.getAmount();
        Billing billing = new Billing(PaymentOption.UPI, "123");
        Order order = new Order(productToCheckOut, address, contactNumber, billing, amount);
        String trackingId = order.checkOut();
        System.out.println();
        System.out.println("The following product have been dispatched");
        for (Product boughtProduct: productToCheckOut) {
            System.out.println(boughtProduct.getProductName() + " " + boughtProduct.getBrand());
        }
        System.out.println("The dispatch id is " + trackingId);
    }
}

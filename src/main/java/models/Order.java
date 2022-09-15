package models;

import java.util.List;

public class Order {

    List<Product> productToCheckOut;
    String address;
    String contactNumber;
    Billing billingInfo;
    Double amount;

    public Order(List<Product> productToCheckOut, String address, String contactNumber, Billing billingInfo, Double amount) {
        this.productToCheckOut = productToCheckOut;
        this.address = address;
        this.contactNumber = contactNumber;
        this.billingInfo = billingInfo;
        this.amount = amount;
    }

    public String checkOut() {
        String responsePayment = Payment.processPayment(this.billingInfo, this.amount);
        System.out.println(responsePayment);
        System.out.println();
        String responseNotification = Notification.notifyByEmail(this.amount, this.productToCheckOut);
        System.out.println(responseNotification);
        System.out.println();
        String trackingId = Shipping.packageAndDispatchOrder(productToCheckOut, address, contactNumber);
        return trackingId;


    }


}

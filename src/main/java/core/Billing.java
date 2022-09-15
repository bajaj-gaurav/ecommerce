package core;

public class Billing {

    PaymentOption paymentOption;
    String details;

    public PaymentOption getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Billing(PaymentOption paymentOption, String details) {
        this.paymentOption = paymentOption;
        this.details = details;
    }
}

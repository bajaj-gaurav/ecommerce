package models;

public class Product {

    String brand;
    String productName;
    Double amount;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Product(String brand, String productName, Double amount) {
        this.brand = brand;
        this.productName = productName;
        this.amount = amount;
    }
}

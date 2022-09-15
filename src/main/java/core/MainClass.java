package core;

public class MainClass {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.addToCart("fastrack", "watch");
        customer.addToCart("safolla", "oil");
        customer.addToCart("lakme", "cream");
        customer.addToCart("levis", "jeans");
        System.out.println();
        customer.checkOut();
    }
}

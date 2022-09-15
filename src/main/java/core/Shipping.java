package core;

import java.util.List;

public class Shipping {


    public static String packageAndDispatchOrder(List<Product> productToCheckOut, String address, String contactNumber) {
        String packageId = packageOrder(productToCheckOut);
        String trackingId = dispatchOrder(packageId, address, contactNumber);
        return trackingId;
    }

    private static String dispatchOrder(String packageId, String address, String contactNumber) {
        System.out.println("Products are dispatched");
        String trackingId = "123456789";
        return trackingId;
    }

    public static String packageOrder(List<Product> productToCheckOut) {
        System.out.println("Products are packaged");
        String packageId = "123456789";
        return packageId;
    }

}

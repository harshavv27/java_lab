package food.utility;

public class OrderUtility {

    public static boolean validateAmount(double amount) {
        return amount>0;
    }

    public static boolean validateCustomerName(String name) {
        return name!=null && !name.trim().isEmpty();
    }

    public static String generateOrderSummary(int orderId, String customerName, double amount,
                                               double discount, double deliveryCharge) {
        double finalAmount = amount-discount+deliveryCharge;
        return "Order ID: "+orderId+
               "\nCustomer: "+customerName+
               "\nOrder Amount: Rs. "+amount+
               "\nDiscount: Rs. "+discount+
               "\nDelivery Charge: Rs. "+deliveryCharge+
               "\nFinal Payable: Rs. "+finalAmount;
    }
}

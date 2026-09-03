package food.service;

import food.model.FoodOrder;
import food.model.Discountable;
import food.utility.OrderUtility;

public class OrderService {

    public static void displayBill(FoodOrder order) {
        double discount = 0;
        if (order instanceof Discountable) {
            discount = ((Discountable) order).applyDiscount();
        }
        double delivery = order.calculateDeliveryCharge();
        System.out.println("-----------------------------");
        System.out.println(OrderUtility.generateOrderSummary(
            order.getOrderId(),
            order.getCustomerName(),
            order.getAmount(),
            discount,
            delivery
        ));
    }

    public static void displayDiscount(FoodOrder order) {
        if (order instanceof Discountable) {
            double discount = ((Discountable) order).applyDiscount();
            System.out.println("Order #"+order.getOrderId()+" Discount: Rs. "+discount);
        }
    }

    public static void displayDeliveryCharge(FoodOrder order) {
        System.out.println("Order #"+order.getOrderId()+" Delivery Charge: Rs. "+order.calculateDeliveryCharge());
    }

    public static void displayFinalAmount(FoodOrder order) {
        double discount = 0;
        if (order instanceof Discountable) {
            discount = ((Discountable) order).applyDiscount();
        }
        double finalAmount = order.getAmount()-discount+order.calculateDeliveryCharge();
        System.out.println("Order #"+order.getOrderId()+" Final Payable: Rs. "+finalAmount);
    }
}

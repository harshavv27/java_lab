package food.main;

import food.model.FoodOrder;
import food.model.RegularOrder;
import food.model.PremiumOrder;
import food.service.OrderService;

public class Main {
    public static void main(String[] args) {
        // Create six orders stored in an array of FoodOrder
        FoodOrder[] orders = new FoodOrder[6];
        orders[0] = new RegularOrder(101, "Arjun Sharma", 500);
        orders[1] = new PremiumOrder(102, "Priya Mehta", 800);
        orders[2] = new RegularOrder(103, "Rahul Verma", 350);
        orders[3] = new PremiumOrder(104, "Sneha Patel", 1200);
        orders[4] = new RegularOrder(105, "Karan Singh", 620);
        orders[5] = new PremiumOrder(106, "Anjali Gupta", 950);

        System.out.println("===== FOOD ORDER MANAGEMENT =====");
        System.out.println("Restaurant: "+FoodOrder.restaurantName);
        System.out.println();

        // Display bill, discount, delivery charge, and final amount for each order
        for (FoodOrder order : orders) {
            OrderService.displayBill(order);
        }

        System.out.println("\n===== SUMMARY =====");
        FoodOrder.displayTotalOrders();
    }
}

package org.example.lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
interface DiscountStrategy {
    double applyDiscount(double price, int quantity);
}

public class task1 {
    public static double calculateTotal(List<Product> products, DiscountStrategy discountStrategy) {
        double total = 0.0;
        for (Product product : products) {
            total += discountStrategy.applyDiscount(product.getPrice(), product.getQuantity()) * product.getQuantity();
        }
        return total;
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000.0, 1));
        products.add(new Product("Mouse", 50.0, 3));
        products.add(new Product("Keyboard", 100.0, 2));
        products.add(new Product("Monitor", 300.0, 1));


        DiscountStrategy percentageDiscount = (price, quantity) -> price * 0.90; // 10% off
        DiscountStrategy fixedDiscount = (price, quantity) -> Math.max(0, price - 20); // $20 off
        DiscountStrategy bulkDiscount = (price, quantity) -> quantity > 2 ? price * 0.85 : price; // 15% off for bulk purchases

        System.out.println("Original Total: " + calculateTotal(products, (price, quantity) -> price));

        System.out.println("Total with Percentage Discount: " + calculateTotal(products, percentageDiscount));
        System.out.println("Total with Fixed Discount: " + calculateTotal(products, fixedDiscount));
        System.out.println("Total with Bulk Discount: " + calculateTotal(products, bulkDiscount));


        DiscountStrategy mixedStrategy = (price, quantity) -> {
            double discountedPrice = bulkDiscount.applyDiscount(price, quantity);
            return fixedDiscount.applyDiscount(discountedPrice, quantity);
        };

        System.out.println("Total with Mixed Discount Strategy: " + calculateTotal(products, mixedStrategy));
    }

}


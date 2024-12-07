/*package org.example.midterm_vjezba;

import java.util.List;
import java.util.Map;

public class Restaurant {
    private String restaurantName;
    private List<Customer> customers;
    private Map<String,MenuItem> menuItems;
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void addMenuItem(MenuItem item){
        menuItems.put("Item",item);
    }
    public Customer getCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null; // Return null if customer not found
    }
    public void displayMenu(){
        for (MenuItem item : menuItems.values()) {
            System.out.println(item.getDescription());
        }
    }
    public double calculateTotalSales() {
        double totalSales = 0.0;
        for (Customer customer : customers) {
            for (TableReservation<? extends MenuItem> reservation : customer.getReservations()) {
                totalSales += reservation.calculateTotalAmount();
            }
        }
        return totalSales;
    }
}
*/
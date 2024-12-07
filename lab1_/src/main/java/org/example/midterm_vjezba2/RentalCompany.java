package org.example.midterm_vjezba2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalCompany {
    private String companyName;
    private List<Customer> customers;
    private Map<String,Vehicle> vehicleInventory;

    public RentalCompany(String companyName){
        this.companyName = companyName;
        this.customers=new ArrayList<>();
        this.vehicleInventory=new HashMap<>();
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    public void addVehicle(Vehicle vehicle){
        this.vehicleInventory.put(vehicle.getVehicleId(),vehicle);
    }
    public Customer getCustomer(String customerId){
        for(Customer customer:customers){
            if (customer.getCustomerId().equals(customerId)){
                return customer;}
        }
        return null;
    }
    public void displayInventory(){
        for (Vehicle vehicle: vehicleInventory.values())
        {
            System.out.println(vehicle.getDescription());
        }
    }
    public double calculateTotalRevenue() {
        double totalRevenue = 0.0;
        for (Customer customer : customers) {
            for (RentalTransaction<? extends Vehicle> transaction : customer.getRentalHistory()) {
                totalRevenue += transaction.calculateTotalAmount(0);
            }
        }
        return totalRevenue;
    }

}

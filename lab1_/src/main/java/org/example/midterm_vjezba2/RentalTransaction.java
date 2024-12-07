package org.example.midterm_vjezba2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RentalTransaction<T extends Vehicle & Rentable> {
private String transactionId;
private Date rentalDate;
private HashMap<T,Integer> rentedVehicles;
private int customerId;
public RentalTransaction(String transactionId, Date rentalDate, HashMap<T,Integer> rentedVehicles, int customerId) {
    this.transactionId = transactionId;
    this.rentalDate = rentalDate;
    this.rentedVehicles = new HashMap<>();
    this.customerId = customerId;


}
public void addVehicleToRental(T vehicle,int days){
    rentedVehicles.put(vehicle,days);
}
    public double calculateTotalAmount(double discountRate) {
        double totalAmount = 0.0;
        for (Map.Entry<T, Integer> entry : rentedVehicles.entrySet()) {
            T vehicle = entry.getKey();
            int days = entry.getValue();
            // Primjenjuje se popust korištenjem discountRate
            totalAmount += vehicle.applyDiscount(discountRate) * days;
        }
        return totalAmount;
    }


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public HashMap<T, Integer> getRentedVehicles() {
        return rentedVehicles;
    }

    public void setRentedVehicles(HashMap<T, Integer> rentedVehicles) {
        this.rentedVehicles = rentedVehicles;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

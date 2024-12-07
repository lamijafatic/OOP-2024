package org.example.midterm_vjezba2;

import java.util.Date;
import java.util.HashMap;

public abstract class Vehicle implements  Rentable {
    String vehicleId;
    String name;
    double rentalRate;
    public Vehicle(String vehicleId,String name,double rentalRate){
        this.vehicleId=vehicleId;
        this.name=name;
        this.rentalRate=rentalRate;
        this.kilometersRecord=new HashMap<>();
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Override
    public double applyDiscount(double discountRate){
        double result=0.0;
         result=rentalRate*(1-discountRate);
        return result;
    }
    @Override
    public String getDescription(){
        return "Vehicle ID: " + vehicleId + ", Name: " + name + ", Rental Rate: $" + rentalRate;
    }
private HashMap<Date,Integer> kilometersRecord;

    public void addKilometers(Date rentalDate,int kilometers){
        kilometersRecord.put(rentalDate,kilometers);
    }
    public int getTotalKilometers(){
        int suma=0;
        for (int kilometers : kilometersRecord.values()){
            suma+=kilometers;

        }
        return suma;
    }

    public HashMap<Date, Integer> getKilometersRecord() {
        return kilometersRecord;
    }

    public void setKilometersRecord(HashMap<Date, Integer> kilometersRecord) {
        this.kilometersRecord = kilometersRecord;
    }
}

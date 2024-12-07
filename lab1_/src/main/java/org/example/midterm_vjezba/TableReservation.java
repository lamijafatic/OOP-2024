/*package org.example.midterm_vjezba;

import java.util.Date;
import java.util.HashMap;

public class TableReservation<T> extends MenuItem implements Billable {
    private T value;
    String reservationId;
    Date reservationDate;
    HashMap<T,Integer> orderedItems;
    int tableNumber;

    public TableReservation(String code, String name, double price, T value, String reservationId, Date reservationDate, HashMap<T, Integer> orderedItems, int tableNumber) {
        super(code, name, price);
        this.value = value;
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.orderedItems = orderedItems;
        this.tableNumber = tableNumber;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public HashMap<T, Integer> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(HashMap<T, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void addItemToOrder(T item,int quantity){
        orderedItems.put(item,quantity);
    }
    public double calculateTotalAmount() {
        double totalAmount = 0.0;

     /*   // Prolazak kroz sve naručene stavke i izračunavanje ukupne cijene
        for (T item : orderedItems.keySet()) {
            int quantity = orderedItems.get(item);
            totalAmount += item.getPrice() * quantity; // Pretpostavljamo da postoji getPrice() metoda u Billable
            totalAmount -= item.getDiscount() * quantity; // Pretpostavljamo da postoji getDiscount() metoda u Billable
        }
        return



    }
    /*

      */

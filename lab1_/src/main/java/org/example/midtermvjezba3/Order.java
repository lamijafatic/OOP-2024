package org.example.midtermvjezba3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Order<T extends Item & Sellable>{
    private String orderNo;
    private Date createAt;
    private HashMap<T,Integer> items;
    public Order(String orderNo,Date createAt, HashMap items) {

        this.orderNo = orderNo;
        this.createAt = createAt;
        this.items = new HashMap<>();
    }
    /*public void addItem(T item,int quantity){
        items.put(item,items.getOrDefault(item, 0) + quantity);
    }*/
    public void addItem(T item, int quantity) {
        if (items.containsKey(item)) {
            // Ako stavka već postoji, ažuriraj količinu
            items.put(item, items.get(item) + quantity);
        } else {
            // Ako stavka ne postoji, dodaj je s datom količinom
            items.put(item, quantity);
        }
    }
    public double calculateTotalAmount(){
        double totalAmount = 0;
        for (Map.Entry<T, Integer> entry : items.entrySet()) {
            T item = entry.getKey();
            int quantity = entry.getValue();
            totalAmount += item.getPrice() * quantity;
        }
        return totalAmount;

    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public HashMap<T, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<T, Integer> items) {
        this.items = items;
    }
}

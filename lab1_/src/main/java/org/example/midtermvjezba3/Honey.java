package org.example.midtermvjezba3;

public class Honey extends Item {
    private HoneyType honeyType;

    public Honey(String barcode, String name, double price, HoneyType honeyType) {
        super(barcode, name, price);
        this.honeyType = honeyType;
    }

    @Override
    public String getDescription() {
        return "honey type: " + this.honeyType;
    }
    public void setHoneyType(HoneyType honeyType){
        this.honeyType=honeyType;
    }
    public HoneyType setHoneyType(){
        return this.honeyType;
    }
}
package org.example.midterm_vjezba;

public class Dish extends MenuItem {
    String mainIngredient;
    CuisineType cuisineType;

    public Dish(String mainIngredient, CuisineType cuisineType,String code,String name,double price) {
        super(code,name,price);
        this.mainIngredient = mainIngredient;
        this.cuisineType = cuisineType;
    }
    @Override
  public  String getDescription(){
        return this.cuisineType+" "+this.mainIngredient;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }
}

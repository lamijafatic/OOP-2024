package org.example.lab4;

public class Person {
    private String name;
    private String address;
    private int age;
    private String country;
     public Person(String name, String address, int age, String country) {
         this.name = name;
         this.address = address;
         this.age = age;
         this.country = country;
     }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDetails(){
         return name + "\n   " + address;
     }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
   public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}

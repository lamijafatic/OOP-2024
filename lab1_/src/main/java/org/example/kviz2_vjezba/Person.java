package org.example.kviz2_vjezba;

public class Person {
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void setAge(int Age){
        this.age=Age;
    }
    public Person(String name){
        this.age=0;
        this.name=name;
    }
}

package org.example.kviz2_vjezba;

public class Student2 extends Person2 {
    private int credits;
    public Student2(String name,String address){
        super(name,address);
        this.credits=0;
    }
    public void study(){
        this.credits++;
    }
    public int getCredits() {
        return credits;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"Credits: "+this.credits;

    }
}

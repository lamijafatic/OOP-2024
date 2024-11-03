package org.example.kviz2_vjezba;

import java.util.Random;

public class Telefon extends Proizvod{
    private String model;
    private int brojKamera;


    public Telefon(String model,int brojKamera,String brend,GodineGarancije godineGarancije){
        super(brend,godineGarancije);
        this.model=model;
        this.brojKamera=brojKamera;
    }
    @Override

    public void prikaziDetalje(){
        System.out.println(this.brojKamera+" "+this.model);
    }

    public int izracunajCijenu(int osnovnaCijena){
        Random broj=new Random();
        int cena= broj.nextInt(100);
        return cena+osnovnaCijena;
    }
}


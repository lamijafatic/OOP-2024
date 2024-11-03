package org.example.kviz2_vjezba;

public class Proizvod {
    private String brend;
    private GodineGarancije godineGarancije;
    public Proizvod(String brend,GodineGarancije godineGarancije){
        this.brend=brend;
        this.godineGarancije=godineGarancije;
    }
    public void prikaziDetalje(){
        System.out.println((this.brend+" "+this.godineGarancije)) ;
    }

}

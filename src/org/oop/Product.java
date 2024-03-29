package org.oop;

import java.util.Random;

public class Product {
    int codice;
    String nome;
    String descrizione;
    double prezzo;
    int iva;

    public Product(String nome,String descrizione,double prezzo,int iva){
        Random random = new Random();
        this.codice = random.nextInt(90000000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    void BasePrice() {
        System.out.println("Il prezzo è "+prezzo);
    }
    double getIva(){
      double prezzoIva = prezzo + (prezzo * iva /100) ;
      return prezzoIva;
    }
    String nomeEsteso(){
        String codiceString = String.format("%08d", codice);
        return codiceString + "-" + nome;
    }
}

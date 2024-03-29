package org.oop;

import java.util.Random;

public class Product {
    int codice;
    String nome;
    String descrizione;
    int Prezzo;
    int iva;

    public Product(int codice,String nome,String descrizione,int Prezzo,int iva){
        Random random = new Random();
        this.codice = random.nextInt(90000000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.Prezzo = Prezzo;
        this.iva = iva;

    }

}

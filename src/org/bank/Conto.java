package org.bank;

import java.util.Random;

public class Conto {
    int numero;
    String nome;
    double saldo;

    public Conto(String nome, double saldo){
        Random random = new Random();
        this.numero= random.nextInt(1000);
        this.nome = nome;
        this.saldo = saldo;
    }
    public double Deposita(double deposito){
        saldo += deposito;
        return saldo;
    }
    public double Preleva(double prelievo){
        if (prelievo < saldo) {
            saldo -= prelievo;
        }
        else{
            System.out.println("Non hai abbastanza saldo");
        }
        return saldo;
    }

}

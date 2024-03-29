package org.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Il tuo nome:");
        String nome = scan.nextLine();
         Conto conto1 = new Conto(nome,2000);
        System.out.println(conto1.nome);
        System.out.println("il numero del tuo conto è " + conto1.numero);
        System.out.println("il tuo saldo è " + conto1.saldo);
        boolean esci = false;
        while (esci == false){
            System.out.println("Scegli un'opzione:");
            System.out.println("1. deposita");
            System.out.println("2. preleva");
            System.out.println("3. esci");
            int scelta = scan.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Quanto vuoi depositare?");
                    double deposito = scan.nextDouble();
                    conto1.Deposita(deposito);
                    System.out.println("il tuo nuovo saldo è "+ conto1.saldo);
                    break;
                case 2:
                    System.out.println("Quanto vuoi prelevare?");
                    double prelievo = scan.nextDouble();
                    conto1.Preleva(prelievo);
                    System.out.println("il tuo nuovo saldo è "+ conto1.saldo);
                    break;
                case 3:
                    esci = true;
                    break;
            }
        }
    }
}

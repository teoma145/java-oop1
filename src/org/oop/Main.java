package org.oop;

public class Main {
    public static void main(String[] args) {
    Product product1 = new Product("Lavatrice","lava benissimo",199.99,22);
        product1.BasePrice();
        System.out.println("prodotto con iva: "+product1.getIva());
        System.out.println("nome esteso: "+ product1.nomeEsteso());

        Product product2 = new Product("Forno","cucina benissimo",179.99,22);
        product2.BasePrice();
        System.out.println("prodotto con iva: "+product2.getIva());
        System.out.println("nome esteso: "+ product2.nomeEsteso());
    }

}

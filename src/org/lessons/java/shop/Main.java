package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Nome Prodotto: ");
        String name =scan.nextLine();
        System.out.print("Descrizione Prodotto: ");
        String description =scan.nextLine();
        System.out.print("Prezzo del Prodotto: ");
        double price = Double.parseDouble(scan.nextLine());

        Prodotto product = new Prodotto(name, description, price);


        System.out.println("Codice: " + product.getCode());
        System.out.println("Nome: " + product.getName());
        System.out.println("Descrizione: " + product.getDescription());
        System.out.println("Prezzo: " + product.getPrice());
        System.out.println("Prezzo con IVA: " + product.getIvaPrice());
        System.out.println("Nome esteso: " + product.getExtendedName());


        System.out.print("Nuovo Nome: ");
        String newName =scan.nextLine();
        product.setName(newName);

        System.out.print("Nuova Descrizione: ");
        String newDescription =scan.nextLine();
        product.setDescription(newDescription);

        System.out.print("Nuovo Prezzo: ");
        double newPrice = Double.parseDouble(scan.nextLine());
        product.setPrice(newPrice);

        System.out.println("Nuovo nome: " + product.getName());
        System.out.println("Nuova descrizione: " + product.getDescription());



        scan.close();
    }
}

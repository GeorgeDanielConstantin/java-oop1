package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String ownerName = scanner.nextLine();

        Conto conto = new Conto(ownerName);

        boolean check = true;
        while (check) {
            System.out.println("Benvenuto");
            System.out.println("1. Versare una somma di denaro");
            System.out.println("2. Prelevare una somma di denaro");
            System.out.println("3. Informazioni conto");
            System.out.println("4. Uscire");
            System.out.print("Seleziona un'opzione: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Inserisci l'importo da versare: ");
                    double depositAmount = scanner.nextDouble();
                    conto.deposit(depositAmount);
                    System.out.println("Saldo attuale: " + conto.getBalance() + " euro");
                }
                case 2 -> {
                    System.out.print("Inserisci l'importo da prelevare: ");
                    double withdrawAmount = scanner.nextDouble();
                    conto.withdraw(withdrawAmount);
                    System.out.println("Saldo attuale: " + conto.getBalance() + " euro");
                }
                case 3 -> conto.accInfo();
                case 4 -> check = false;
                default -> System.out.println("Scelta non valida. Riprova.");
            }

        }
    }
}

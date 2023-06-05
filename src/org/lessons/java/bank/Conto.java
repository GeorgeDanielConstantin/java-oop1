package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    private final int accNumber;
    private final String ownerName;
    private double balance;

    public Conto(String ownerName) {
        this.accNumber = genRandomAccNumber();
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    private int genRandomAccNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Versamento effettuato con successo.");
        } else {
            System.out.println("L'importo del versamento deve essere positivo.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Prelievo effettuato con successo.");
            } else {
                System.out.println("Saldo insufficiente per il prelievo.");
            }
        } else {
            System.out.println("L'importo del prelievo deve essere positivo.");
        }
    }

    public void accInfo() {
        System.out.println("Numero conto: " + accNumber);
        System.out.println("Proprietario: " + ownerName);
        System.out.println("Saldo: " + balance + " euro");
    }
}
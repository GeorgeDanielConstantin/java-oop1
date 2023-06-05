package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private final int code;
    private String name;
    private String description;
    private double price;

    private double iva;

    public Prodotto(String name, String description, double price, double iva) {
        this.code = generateRandomCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    private int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(100000000);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIvaPrice() {
        return price + (price * iva/100);
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getExtendedName() {
        return code + "-" + name;
    }
}

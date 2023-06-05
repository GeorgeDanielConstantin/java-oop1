package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private final int code;
    private String name;
    private String description;
    private double price;

    private final double ivaPrice;

    public Prodotto(String name, String description, double price) {
        this.code = generateRandomCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.ivaPrice = generateIvaPrice();
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


    private double generateIvaPrice() {
        double iva = 0.22;
        return price + (price * iva);
    }

    public double getIvaPrice() {
        return ivaPrice;
    }

    public String getExtendedName() {
        return code + "-" + name;
    }
}

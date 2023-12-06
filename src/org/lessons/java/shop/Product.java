package org.lessons.java.shop;

public class Product {
    private int code;
    private String name, description;
    private double price, iva;

    public Product(String name, String description, double iva, double price) {
        this.code = generateRandomCode(1, Integer.MAX_VALUE);
        this.name = isValidName(name) ? name : "";
        this.description = isValidDesctiption(description) ? description : "";
        this.iva = isValidIva(iva) ? iva : -1.0d;
        this.price = isValidPrice(price) ? price : -1.0d;
    }

    /* EXERCISE METHODS */

    public double showPrice(boolean withIva) {
        if (withIva)
            return price + (price * (iva / 100));
        else
            return getPrice();
    }

    public String getFullName() {
        return code + name;
    }

    /* UTILS */

    private int generateRandomCode(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    /* INPUT VALIDATORS */

    private boolean isValidName(String name) {
        return name.length() >= 2;
    }

    private boolean isValidDesctiption(String description) {
        return description.isEmpty();
    }

    private boolean isValidIva(double iva) {
        return iva >= 0d && iva <= 100d;
    }

    private boolean isValidPrice(double price) {
        return price >= 0d;
    }

    private String isValidIva(String iva) {
        return iva.length() == 11 ? iva : "";
    }

    /* GETTER AND SETTER */

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidName(name))
            this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (isValidDesctiption(description))
            this.description = description;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        if (isValidIva(iva))
            this.iva = iva;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (isValidPrice(price))
            this.price = price;
    }
}

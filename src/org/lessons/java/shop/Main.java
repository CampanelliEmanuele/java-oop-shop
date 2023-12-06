package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Product prod = new Product("prodName", "prodDescription", 23.0d, 10.00d);

        System.out.println("Full name: " + prod.getFullName());;
        System.out.println("Price without iva: " + prod.showPrice(false) + "€");
        System.out.println("Price with iva (" + prod.getIva() + "%): " + prod.showPrice(true) + "€");



    }
}
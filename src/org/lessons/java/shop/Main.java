package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Category category = new Category("category1", "category1Description");

        Product prod = new Product("prodName", "prodDescription", 23.0d, 10.00d, category);

        System.out.println("Full name: " + prod.getFullName());
        System.out.println("Price without iva: " + prod.showPrice(false) + "€");
        System.out.println("Price with iva (" + prod.getIva() + "%): " + prod.showPrice(true) + "€");

        System.out.println("Product category information:");
        System.out.println("Category name: " + prod.getProdCategory().getName());
        System.out.println("Category description: " + prod.getProdCategory().getDescription());

    }
}
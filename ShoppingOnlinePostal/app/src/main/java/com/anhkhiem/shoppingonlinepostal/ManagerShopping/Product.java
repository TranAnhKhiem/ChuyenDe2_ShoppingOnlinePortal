package com.anhkhiem.shoppingonlinepostal.ManagerShopping;

public class Product {
    String id;
    String name;
    String image;
    String description;
    double price;
    int amountIm;
    int quantityEx;
    int amoutRe;

    public Product() {
    }

    public Product(String id, String name, String image, String description, double price, int amountIm, int quantityEx, int amoutRe) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.amountIm = amountIm;
        this.quantityEx = quantityEx;
        this.amoutRe = amoutRe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public int getAmountIm() {
        return amountIm;
    }

    public void setAmountIm(int amountIm) {
        this.amountIm = amountIm;
    }

    public int getQuantityEx() {
        return quantityEx;
    }

    public void setQuantityEx(int quantityEx) {
        this.quantityEx = quantityEx;
    }

    public int getAmoutRe() {
        return amoutRe;
    }

    public void setAmoutRe(int amoutRe) {
        this.amoutRe = amoutRe;
    }
}

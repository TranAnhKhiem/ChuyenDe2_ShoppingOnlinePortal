package com.anhkhiem.shoppingonlinepostal.ManagerShopping;

import java.util.List;

public class Store {
    String id;
    String name;
    String image;
    String area;
    String phone;
    private List<Product> idProduct;

    public Store() {
    }

    public Store(String id, String name, String image, String area, String phone, List<Product> idProduct) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.area = area;
        this.phone = phone;
        this.idProduct = idProduct;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Product> getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(List<Product> idProduct) {
        this.idProduct = idProduct;
    }
}

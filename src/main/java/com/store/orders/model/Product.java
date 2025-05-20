package com.store.orders.model;

public class Product {
    private Long id;
    private String name;
    private String image;
    private Double inventoryQuantity;
    private double rate;
    private String size;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Double getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Double inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

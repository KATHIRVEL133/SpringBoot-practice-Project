package com.SimpleProject.demo.model;


public class Products {
    public int productId;
    public String name;
    public int cost;

    public Products(int productId, String name, int cost) {
        this.productId = productId;
        this.name = name;
        this.cost = cost;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
}

package com.example.lab1_spring;

public class Product {
    private int id;
    private String name;
    private double weight;
    private double price;
    private String category;

    public Product(int id, String name, double weight, double price, String category) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}



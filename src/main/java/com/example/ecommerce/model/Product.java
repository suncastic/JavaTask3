package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;
    double price;
    int stock;

    public Product(){}

    public Product(String newName, double newPrice, int newStock){
        name = newName;
        price = newPrice;
        stock = newStock;
    }

    // Name
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    // Price
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }

    // Stock
    public int getStock(){
        return stock;
    }
    public void setStock(int newStock){
        stock = newStock;
    }
}

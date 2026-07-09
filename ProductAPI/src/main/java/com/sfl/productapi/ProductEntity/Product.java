package com.sfl.productapi.ProductEntity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private  double price;
    public Product(){

    }
    public Product(Integer id, String productName, double price){
        this.id=id;
        this.productName=productName;
        this.price=price;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public void setProductName(String name){
        this.productName=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }

}

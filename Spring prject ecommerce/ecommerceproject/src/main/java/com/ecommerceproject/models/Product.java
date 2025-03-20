package com.ecommerceproject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private String category;

   
    public Product() {}

    public Product(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

  
    public Long getId() { 
    	return id; 
    }
    public String getName() { 
    	return name;
    }
    public String getDescription() { 
    	return description; 
    }
    public double getPrice() { 
    	return price; 
    }
    public String getCategory() { 
    	return category; 
    }

    
    public void setId(Long id) { 
    	this.id = id; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }
    public void setDescription(String description) { 
    	this.description = description; 
    }
    public void setPrice(double price) { 
    	this.price = price; 
    }
    public void setCategory(String category) { 
    	this.category = category; 
    }
}
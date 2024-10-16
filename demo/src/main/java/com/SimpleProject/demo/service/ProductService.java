package com.SimpleProject.demo.service;
import com.SimpleProject.demo.model.*;
import com.SimpleProject.demo.repository.ProductRepo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
    //List<Products> products = new ArrayList<>(Arrays.asList(new Products(001,"laptop",20000),new Products(002,"mobiles",30000)));
    
    @Autowired
    ProductRepo repo;
    public List<Products> getProducts()
    {
        return repo.findAll();
    }
    public Products getProductById(int prodId)
    {
        return repo.findById(prodId).orElse(new Products());
    }
    public String addProduct(Products prod)
    {
        
        repo.save(prod);
        return "Product added successfully";
    }
    public String updateProduct(Products prod) {
        repo.save(prod);
        return "Product updated successfully";
    }
    public String deleteProduct(int prodId) {
    repo.deleteById(prodId);
     return "deleted successfully";
    }
}

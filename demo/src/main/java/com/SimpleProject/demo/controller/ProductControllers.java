package com.SimpleProject.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SimpleProject.demo.model.Products;
import com.SimpleProject.demo.service.ProductService;

@RestController
public class ProductControllers {
     @Autowired
    ProductService service;
    @RequestMapping("/getProducts")
    public List<Products> getProducts()
    {
        return service.getProducts();
    }

}

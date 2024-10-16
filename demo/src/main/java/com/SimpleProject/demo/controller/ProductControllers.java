package com.SimpleProject.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SimpleProject.demo.model.Products;
import com.SimpleProject.demo.service.ProductService;

@RestController
public class ProductControllers {
     @Autowired
    ProductService service;

    @GetMapping("/getProducts")
    public List<Products> getProducts()
    {
        return service.getProducts();
    }
    @GetMapping("/product/{prodId}")
    public Products getProduct(@PathVariable int prodId)
    {
       return service.getProductById(prodId);
    }
    @PostMapping("/product")
    public String addProduct(@RequestBody Products prod)
    {
      return service.addProduct(prod);
    }
    @PutMapping("/product")
    public String updateProduct(@RequestBody Products prod)
    {
      return service.updateProduct(prod);
    }
    @DeleteMapping("/product/{prodId}")
    public String deleteProduct(@PathVariable int prodId)
    {
    return service.deleteProduct(prodId);
    }

}

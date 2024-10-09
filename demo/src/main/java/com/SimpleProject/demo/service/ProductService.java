package com.SimpleProject.demo.service;
import com.SimpleProject.demo.model.*;
import java.util.*;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
    List<Products> products = Arrays.asList(new Products(001,"laptop",20000),new Products(002,"mobiles",30000));
   
    public List<Products> getProducts()
    {
        return products;
    }
}

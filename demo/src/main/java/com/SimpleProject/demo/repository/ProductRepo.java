package com.SimpleProject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SimpleProject.demo.model.Products;



@Repository

public interface ProductRepo extends JpaRepository<Products,Integer>{
     
}

package com.tpl.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tpl.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}


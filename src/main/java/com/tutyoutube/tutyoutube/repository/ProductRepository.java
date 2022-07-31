package com.tutyoutube.tutyoutube.repository;

import com.tutyoutube.tutyoutube.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}

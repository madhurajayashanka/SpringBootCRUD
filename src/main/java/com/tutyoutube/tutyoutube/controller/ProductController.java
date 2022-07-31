package com.tutyoutube.tutyoutube.controller;

import com.tutyoutube.tutyoutube.entity.Product;
import com.tutyoutube.tutyoutube.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/add-products")
    public List<Product> addProduct(@RequestBody List<Product> product){
        return service.saveProducts(product);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProduct(id);
    }

    @GetMapping("/productName/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}

package com.example.inventory.service;

import com.example.inventory.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    void saveProduct(Product product);

    void deleteProduct(Long id);
}

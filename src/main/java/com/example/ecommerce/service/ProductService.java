package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(){}
    public ProductService(ProductRepository newProductRepository){
        productRepository = newProductRepository;
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.getReferenceById(id);
    }

    public void addProduct(Product newProduct){

    }

    public void updateProduct(Long id, Product product){


    }

    public void deleteProduct(Long id){

    }
}


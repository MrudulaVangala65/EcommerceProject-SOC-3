package com.ecommerceproject.service;

import com.ecommerceproject.models.Product;
import com.ecommerceproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class ProductServiceImpl {

    @Autowired
    private ProductRepository productRepository;

  
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

   
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    
    public Product updateProduct(Long id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

   
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

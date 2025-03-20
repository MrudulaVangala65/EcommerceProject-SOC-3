package com.ecommerceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerceproject.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	

}

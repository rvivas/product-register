package com.product.register.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.product.register.app.model.Product;
import com.product.register.app.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product createProduct(Product product) {
		try {
			return productRepository.save(product);
		}catch(Exception e) {
			throw new  ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Problems creating a product");
		}
		
	}
	
	public List<Product> getListProduct() {
		try {
			return productRepository.findAll();
		}catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Problems creating a product");
		}
		
	}
	
}

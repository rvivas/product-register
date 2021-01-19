package com.product.register.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.register.app.model.Product;
import com.product.register.app.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PutMapping("/createProduct")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(productService.createProduct(product), HttpStatus.OK);
	}
	
	@GetMapping("/listProduct")
	public ResponseEntity<List<Product>> listProduct(){
		return new ResponseEntity<List<Product>>(productService.getListProduct(), HttpStatus.OK);
	} 
	
}

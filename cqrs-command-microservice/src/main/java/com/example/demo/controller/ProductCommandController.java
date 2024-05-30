package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductCommandService;

@RestController
@RequestMapping("/products")
public class ProductCommandController {
	
	@Autowired
	private ProductCommandService commandService;
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {		
		return commandService.createProduct(product);		
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
		return commandService.updateProduct(id, product);
	}

}

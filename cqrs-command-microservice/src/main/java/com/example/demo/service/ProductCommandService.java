package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductCommandService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product createProduct(Product product) {		
		return repository.save(product);		
	}
	
	public Product updateProduct(Long id,Product product) {
		Product existingProduct = repository.findById(id).get();
		existingProduct.setName(product.getName());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);	
		
	}

}

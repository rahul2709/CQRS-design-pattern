package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductQueryService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> getAll(){
		
		return repository.findAll();
	}

}

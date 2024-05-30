package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductQueryService;

@RestController
@RequestMapping("/getproducts")
public class ProductQueryController {
	
	@Autowired
	private ProductQueryService queryService;
	
	@GetMapping
	public List<Product>getProducts()
	{
		return queryService.getAll();
	}

}

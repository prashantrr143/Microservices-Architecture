package com.onlinestore.microservices.inventrory.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinestore.microservices.inventrory.model.Product;

@RestController
@RequestMapping(path ="/api/v1/products")
public class ProductsController {

	
	
	@GetMapping(path ="/{productId}")
	public List<Product> fetchProductsByProductId(@PathVariable("productId") String productId){
		
		
		List<Product> products  = new ArrayList<>();
		return products;
	}
	
}

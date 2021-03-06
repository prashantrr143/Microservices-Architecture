package com.onlinestore.microservices.inventrory.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinestore.microservices.inventrory.model.Product;

import com.onlinestore.microservices.inventrory.service.ProductService;

@RestController
@RequestMapping(path = "/api/v1/products")
public class ProductsController {

	@Autowired
	ProductService productService;

	@GetMapping(path = "/{productId}")
	public List<Product> fetchProductsByProductId(@PathVariable("productId") String productId) {

		List<Product> products = new ArrayList<>();
		return products;
	}

	@GetMapping("/")
	public List<Product> fetchProductsByCriteria(@RequestParam(name = "offset", defaultValue = "0") long offset,
			@RequestParam(name = "limit", defaultValue = "30") long limit) {
		List<Product> products = new ArrayList<>();
		System.out.println("Passed Request Parameters :  offset: " + offset +" , limit " + limit);
		return products;

	}

}

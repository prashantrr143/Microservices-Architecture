package com.onlinestore.microservices.inventrory.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinestore.microservices.inventrory.model.Category;
import com.onlinestore.microservices.inventrory.service.CategoryService;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/")
	public Set<Category> getCatogories() {

		return categoryService.getAllCategories();

	}

}

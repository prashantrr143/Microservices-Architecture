package com.onlinestore.microservices.inventrory.service;

import java.util.Set;

import com.onlinestore.microservices.inventrory.model.Category;

public interface CategoryService {

	public Set<Category> getAllCategories();

	public Category getCategory(long categoryId);

}

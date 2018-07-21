package com.onlinestore.microservices.inventrory.model;

import java.util.Set;

/**
 * Entity Modeling Category
 * 
 * @author prasingh26
 *
 */
public class Category {

	private long categoryId;
	private String name;
	private String description;

	private Set<Category> childCategories;
	private Set<Product> products;

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}

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
	private Category parentCategory;

	public Category() {
	}

	public Category(long id, String name) {
		super();
		this.categoryId = id;
		this.name = name;
	}

	public Category(long id, String name, String description) {
		this(id, name);
		this.description = description;
	}

	public static class CategoryBuilder {
		private static CategoryBuilder instance;

		private Category category = new Category();

		public static CategoryBuilder getInstance() {
			return instance;
		}

		public Category setId(long id) {
			category.setCategoryId(id);
			return category;
		}

		public Category setName(String name) {
			category.setName(name);
			return category;
		}

		public Category setDescription(String description) {
			category.setDescription(description);
			return category;
		}

		public Category setChildCatories(Set<Category> childCategories) {
			category.setChildCategories(childCategories);
			return category;
		}

		public Category setProducts(Set<Product> products) {
			category.setProducts(products);
			return category;
		}

		public Category setParent(Category parentCategory) {
			category.setParentCategory(parentCategory);
			return category;
		}

	}

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

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

}

package com.onlinestore.microservices.inventrory.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.onlinestore.microservices.inventrory.model.Category;
import com.onlinestore.microservices.inventrory.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Override
	public Set<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return getMockedUpCategories();
	}

	@Override
	public Category getCategory(long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	private Set<Category> getMockedUpCategories() {

		Category categoryP1 = new Category(1000L, "Electronics",
				"Category under which you can find all electronic products");
		Category categoryP2 = new Category(2000L, "Drinks & Beverages",
				"Category under which you can find all Drinks and Beverages");
		Category categoryP3 = new Category(3000L, "Musical Items",
				"Category under which you can find Guitars,Drums, Flutes and other items");
		Category categoryP4 = new Category(4000L, "Furniture", "Category which lets you view beds, sofas, chairs etc.");
		Category categoryP5 = new Category(5000L, "Automobile Accessories",
				"Category under which you can find all products to take care of your auto-mobiles");

		Set<Category> categories = new HashSet<>();
		categories.add(categoryP1);
		categories.add(categoryP2);
		categories.add(categoryP3);
		categories.add(categoryP4);
		categories.add(categoryP5);
		return null;
	}
}

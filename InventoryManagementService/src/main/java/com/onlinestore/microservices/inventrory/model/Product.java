package com.onlinestore.microservices.inventrory.model;

import java.math.BigDecimal;
import java.util.List;


/**
 * Entity Model of representing a Product
 * 
 * @author prasingh26
 *
 */
public class Product {

	private long productId;
	private String name;
	private String description;
	List<Category> productCategories;
	private BigDecimal price;
	private BigDecimal discountedPrice;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
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

	public List<Category> getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(List<Category> productCategories) {
		this.productCategories = productCategories;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

}

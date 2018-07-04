package in.prashant.microservices.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable {

	private static final long serialVersionUID = 1l;

	private long id;

	private String itemName;
	private String itemDescription;
	private BigDecimal price;
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}

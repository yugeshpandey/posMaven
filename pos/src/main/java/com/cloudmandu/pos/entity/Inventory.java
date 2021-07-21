package com.cloudmandu.pos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Inventory {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemId;
	
	private String itemName;
	private Double itemPrice;
	private Boolean isInStock;

	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Boolean getIsInStock() {
		return isInStock;
	}
	public void setIsInStock(Boolean isInStock) {
		this.isInStock = isInStock;
	}
	
	public Inventory(Long itemId, String itemName, Double itemPrice, Boolean isInStock) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.isInStock = isInStock;
	}

	@Override
	public String toString() {
		return "Department [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", isInStock="
				+ isInStock + "]";
	}
	
	
	
	
	

}

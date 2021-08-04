package com.cloudmandu.pos.models;

import com.cloudmandu.pos.entity.InventoryDTO;

public class Inventory {
	
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
	
	public Inventory(InventoryDTO inventorydto) {
		this.setItemName(inventorydto.getItemName());
		this.setIsInStock(inventorydto.getIsInStock());
		this.setItemId(inventorydto.getItemId());
		this.setItemPrice(inventorydto.getItemPrice());
	}

	
}

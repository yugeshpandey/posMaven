package com.cloudmandu.pos.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cloudmandu.pos.models.Inventory;

@Entity
public class InventoryDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemId;

	@Column(name = "NAME")
	private String itemName;

	@Column(name = "PRICE")
	private Double itemPrice;
	@Column(name = "AVAILABILITY")
	private Boolean isInStock;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEALER_ID")
	private DealerDTO dealer;
	
	
	public DealerDTO getDealer() {
		return dealer;
	}

	public void setDealer(DealerDTO dealer) {
		this.dealer = dealer;
	}

	public InventoryDTO() {
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

	public InventoryDTO(Long itemId, String itemName, Double itemPrice, Boolean isInStock) {
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
	
	public InventoryDTO(Inventory inventory) {
		this.setItemId(inventory.getItemId());
		this.setItemName(inventory.getItemName());
		this.setItemPrice(inventory.getItemPrice());
		this.setIsInStock(inventory.getIsInStock());
	}

}

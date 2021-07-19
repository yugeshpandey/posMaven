package com.cloudmandu.pos.service;

import java.util.List;

import com.cloudmandu.pos.entity.Inventory;

public interface InventoryService {

	public Inventory saveInventory(Inventory inventory);

	public List<Inventory> fetchInventoryList();

	public Inventory fetchInventoryByID(Long inventoryID);

	public void deleteInventoryByID(Long inventoryID);

	public Inventory updateInventory(Long inventoryID, Inventory inventory);

	public Inventory fetchInventoryByName(String inventoryName);
	
	

}

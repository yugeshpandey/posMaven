package com.cloudmandu.pos.service;

import java.util.List;

import com.cloudmandu.pos.entity.Inventory;
import com.cloudmandu.pos.error.InventoryNotFoundException;

public interface InventoryService {

	public Inventory saveInventory(Inventory inventory);

	public List<Inventory> fetchInventoryList();

	public Inventory fetchInventoryByID(Long inventoryID) throws InventoryNotFoundException;

	public void deleteInventoryByID(Long inventoryID);

	public Inventory updateInventory(Long inventoryID, Inventory inventory);

	public Inventory fetchInventoryByName(String inventoryName);
	
	public Inventory fetchInventoryByNameIgnoreCase(String inventoryName);
	
	
	

}

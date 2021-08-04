package com.cloudmandu.pos.service;

import java.util.List;

import com.cloudmandu.pos.error.InventoryNotFoundException;
import com.cloudmandu.pos.models.Inventory;

public interface InventoryService {

	public Inventory saveInventory(Inventory inventory);

	public List<Inventory> fetchInventoryList();

	public Inventory fetchInventoryByID(Long inventoryID) throws InventoryNotFoundException;

	public void deleteInventoryByID(Long inventoryID) throws InventoryNotFoundException;

	public Inventory updateInventory(Long inventoryID, Inventory inventory) throws InventoryNotFoundException;

		
	

}

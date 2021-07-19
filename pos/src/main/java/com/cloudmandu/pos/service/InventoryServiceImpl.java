package com.cloudmandu.pos.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cloudmandu.pos.entity.Inventory;
import com.cloudmandu.pos.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;

	@Override
	public Inventory saveInventory(Inventory inventory) {
		
		return inventoryRepository.save(inventory);
	}

	@Override
	public List<Inventory> fetchInventoryList() {
		
		return inventoryRepository.findAll();
	}

	@Override
	public Inventory fetchInventoryByID(Long inventoryID) {
		
		return inventoryRepository.findById(inventoryID).get();
	}

	@Override
	public void deleteInventoryByID(Long inventoryID) {
		
		inventoryRepository.deleteById(inventoryID);
		
	}

	@Override
	public Inventory updateInventory(Long inventoryID, Inventory inventory) {
		Inventory inventoryDB = inventoryRepository.findById(inventoryID).get();
		
		if(Objects.nonNull(inventory.getItemName()) && 
				!"".equalsIgnoreCase(inventory.getItemName())) {
			inventoryDB.setItemName(inventory.getItemName());
		}
		
		if(Objects.nonNull(inventory.getItemId()) && 
				(!(inventory.getItemId() == null) )) {
			inventoryDB.setItemId(inventory.getItemId());
		}
		
		if(Objects.nonNull(inventory.getIsInStock())) {
			inventoryDB.setIsInStock(inventory.getIsInStock());
		}
		
		return inventoryRepository.save(inventoryDB);
	}

	@Override
	public Inventory fetchInventoryByName(String inventoryName) {
		
		return inventoryRepository.findByItemName(inventoryName);
	}
	
	
	

}

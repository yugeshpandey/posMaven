package com.cloudmandu.pos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudmandu.pos.entity.InventoryDTO;
import com.cloudmandu.pos.error.InventoryNotFoundException;
import com.cloudmandu.pos.models.Inventory;
import com.cloudmandu.pos.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;


	@Override
	public Inventory saveInventory(Inventory inventory) {
		InventoryDTO inventorydto = new InventoryDTO();
		inventorydto.setItemName(inventory.getItemName());
		inventorydto.setItemPrice(inventory.getItemPrice());
		inventorydto.setIsInStock(inventory.getIsInStock());
		inventorydto = inventoryRepository.save(inventorydto);
		inventory.setItemId(inventorydto.getItemId());
		return inventory;
	}

	@Override
	public List<Inventory> fetchInventoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory fetchInventoryByID(Long inventoryID) throws InventoryNotFoundException {
		Optional<InventoryDTO> optional = inventoryRepository.findById(inventoryID);
		Inventory inventory = new Inventory();
		
		if(!optional.isEmpty()) {
			InventoryDTO inventorydto = optional.get();
			inventory.setItemName(inventorydto.getItemName());
			inventory.setItemPrice(inventorydto.getItemPrice());
			inventory.setIsInStock(inventorydto.getIsInStock());
			inventory.setItemId(inventorydto.getItemId());
		}
	
		return inventory;
	}

	@Override
	public void deleteInventoryByID(Long inventoryID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Inventory updateInventory(Long inventoryID, Inventory inventory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory fetchInventoryByName(String inventoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory fetchInventoryByNameIgnoreCase(String inventoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

package com.cloudmandu.pos.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloudmandu.pos.entity.Inventory;
import com.cloudmandu.pos.service.InventoryService;

@RestController
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/inventories")
	public Inventory saveInventory(@RequestBody Inventory inventory) {
		
		return inventoryService.saveInventory(inventory);
		
	}
	
	@GetMapping("/inventories")
	public List<Inventory> fetchInventoryList() {
		return inventoryService.fetchInventoryList();
		
	}
	
	@GetMapping("/inventories/{id}")
	public Inventory fetchInventoryById(@PathVariable("id") Long inventoryID) {
		return inventoryService.fetchInventoryByID(inventoryID);
		
	}
	
	@DeleteMapping("/inventories/{id}")
	public String deleteInventoryByID(@PathVariable("id") Long inventoryID) {
		inventoryService.deleteInventoryByID(inventoryID);
		return "Item deleted successfully";
	}
	
	
	@PutMapping("/inventories/{id}")
	public Inventory updateInventory(@PathVariable("id") Long inventoryID, @RequestBody Inventory inventory ) {
		
		return inventoryService.updateInventory(inventoryID, inventory);
		
	}
	
	@GetMapping("/inventories/name/{name}")
	public Inventory fetchInventoryByName(@PathVariable("name") String inventoryName) {
		return inventoryService.fetchInventoryByName(inventoryName);
	}

}

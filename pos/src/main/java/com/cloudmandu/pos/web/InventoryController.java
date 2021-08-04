package com.cloudmandu.pos.web;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudmandu.pos.error.InventoryNotFoundException;
import com.cloudmandu.pos.models.Inventory;
import com.cloudmandu.pos.service.InventoryService;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(InventoryController.class);
	
	@PostMapping("/save")
	public Inventory saveInventory(@Valid @RequestBody Inventory inventory) {
		LOGGER.info("Inside saveInventory of InventoryController");
		return inventoryService.saveInventory(inventory);
		
	}
	
	@GetMapping("/get")
	public List<Inventory> fetchInventoryList() {
		LOGGER.info("Inside fetchInventory of Inventory Controller");
		return inventoryService.fetchInventoryList();
		
	}
	
	@GetMapping("/{id}/get")
	public Inventory fetchInventoryById(@PathVariable("id") Long inventoryID) throws InventoryNotFoundException {
		return inventoryService.fetchInventoryByID(inventoryID);
		
	}
	
	@DeleteMapping("/{id}/delete")
	public String deleteInventoryByID(@PathVariable("id") Long inventoryID) {
		LOGGER.info("Inside delete inventory by ID of Inventory Controller");
		inventoryService.deleteInventoryByID(inventoryID);
		return "Item deleted successfully";
	}
	
	
	@PutMapping("/{id}/update")
	public Inventory updateInventory(@PathVariable("id") Long inventoryID, @RequestBody Inventory inventory ) {
		LOGGER.info("Inside update Inventory of Inventory Controller");
		return inventoryService.updateInventory(inventoryID, inventory);
		
	}
	
	
}

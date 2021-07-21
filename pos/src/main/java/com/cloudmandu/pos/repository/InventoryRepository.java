package com.cloudmandu.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloudmandu.pos.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	
	public Inventory findByItemName(String inventoryName);
	
	public Inventory findByItemNameIgnoreCase(String inventoryName);
	

}

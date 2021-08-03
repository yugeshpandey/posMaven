package com.cloudmandu.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloudmandu.pos.entity.InventoryDTO;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryDTO, Long> {
	
		

}

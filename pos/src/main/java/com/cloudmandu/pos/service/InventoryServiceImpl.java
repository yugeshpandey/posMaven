package com.cloudmandu.pos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudmandu.pos.entity.DealerDTO;
import com.cloudmandu.pos.entity.InventoryDTO;
import com.cloudmandu.pos.error.InventoryNotFoundException;
import com.cloudmandu.pos.mapper.Mapper;
import com.cloudmandu.pos.models.Dealer;
import com.cloudmandu.pos.models.Inventory;
import com.cloudmandu.pos.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	private Mapper<Inventory, InventoryDTO> modelToDto = (a) -> { 
		Inventory inventory = new Inventory();
		inventory.setItemName(a.getItemName());
		inventory.setItemPrice(a.getItemPrice());
		inventory.setIsInStock(a.getIsInStock());
		inventory.setItemId(a.getItemId());
		DealerDTO dealerdto = a.getDealer();
		
		if(dealerdto != null) {
			Dealer dealer = new Dealer();
			dealer.setDealerName(dealerdto.getDealerName());
			dealer.setId(dealerdto.getId());
			inventory.setDealer(dealer);
		}
		
		
		
		return inventory;
	}; 
	
	private Mapper<InventoryDTO, Inventory> dtoToModel = (a) -> { 
		InventoryDTO inventorydto = new InventoryDTO();
		inventorydto.setItemName(a.getItemName());
		inventorydto.setItemPrice(a.getItemPrice());
		inventorydto.setIsInStock(a.getIsInStock());
		inventorydto.setItemId(a.getItemId());
		
		Dealer dealer = a.getDealer();
		
		if(dealer != null) {
			DealerDTO dealerdto = new DealerDTO();
			dealerdto.setDealerName(dealer.getDealerName());
			dealerdto.setId(dealer.getId());
			inventorydto.setDealer(dealerdto);
		}
		return inventorydto;
	}; 



	@Override
	public Inventory saveInventory(Inventory inventory) {
		InventoryDTO inventorydto = dtoToModel.map(inventory);
		inventorydto = inventoryRepository.save(inventorydto);
		inventory = modelToDto.map(inventorydto);
		return inventory;
	}


	@Override
	public List<Inventory> fetchInventoryList() {
		return inventoryRepository.findAll().stream().map(inventorydto -> {
			Inventory inventory = modelToDto.map(inventorydto);
			return inventory;
		}).collect(Collectors.toList());
	}

	@Override
	public Inventory fetchInventoryByID(Long inventoryID) throws InventoryNotFoundException {
		Optional<InventoryDTO> optional = inventoryRepository.findById(inventoryID);
		Inventory inventory = new Inventory();
		
		if(!optional.isEmpty()) {
			inventory = modelToDto.map(optional.get());
			
		}
	
		return inventory;
	}

	@Override
	public void deleteInventoryByID(Long inventoryID) throws InventoryNotFoundException {
		Optional<InventoryDTO> optional = inventoryRepository.findById(inventoryID);
		
		if(!optional.isEmpty()) {
			inventoryRepository.deleteById(inventoryID);
		}
		
	}

	@Override
	public Inventory updateInventory(Long inventoryID, Inventory inventory) throws InventoryNotFoundException{
		Optional<InventoryDTO> optional = inventoryRepository.findById(inventoryID);
		
		if(!optional.isEmpty()) {
			InventoryDTO inventorydto = optional.get();
			
			inventorydto = inventoryRepository.save(inventorydto);
			inventory.setItemId(inventoryID);
			
		}
		
		return inventory;
	}

	
	

}

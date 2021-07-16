package com.cloudmandu.pos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudmandu.pos.service.PosServiceImpl;

@RequestMapping("/pos")
@RestController
public class PosController {
	
	@Autowired
	private PosServiceImpl posService;
	
	@GetMapping("/inventory")
	public String getInventory() {
		return posService.getInventory();
	}
	
	
	
	
	

}

//UI => Controller => Service => DAO 

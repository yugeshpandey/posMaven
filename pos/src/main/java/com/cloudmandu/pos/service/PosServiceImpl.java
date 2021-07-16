package com.cloudmandu.pos.service;

import org.springframework.stereotype.Component;

@Component
public class PosServiceImpl implements PosService{

	@Override
	public String getInventory(){
		return "Hello";
		
	}
	

}

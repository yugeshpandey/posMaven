package com.cloudmandu.pos.error;

@SuppressWarnings("serial")
public class InventoryNotFoundException extends Exception{
	
	public InventoryNotFoundException() {
		super();
	}
	
	public InventoryNotFoundException(String message) {
		super(message);
	}
	
	public InventoryNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public InventoryNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
	
}

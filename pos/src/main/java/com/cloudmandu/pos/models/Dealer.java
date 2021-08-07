package com.cloudmandu.pos.models;

public class Dealer {
	
	private Long id;
	private String dealerName;
	private String dealerAddress;
	private String dealerPhoneNumber;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerPhoneNumber() {
		return dealerPhoneNumber;
	}
	public void setDealerPhoneNumber(String dealerPhoneNumber) {
		this.dealerPhoneNumber = dealerPhoneNumber;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	
	

}

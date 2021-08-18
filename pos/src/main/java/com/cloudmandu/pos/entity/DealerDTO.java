package com.cloudmandu.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "DEALER")
public class DealerDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "DEALER")
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

	public String getDealerAddress() {
		return dealerAddress;
	}

	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}

	public String getDealerPhoneNumber() {
		return dealerPhoneNumber;
	}

	public void setDealerPhoneNumber(String dealerPhoneNumber) {
		this.dealerPhoneNumber = dealerPhoneNumber;
	}
	
	

	

}

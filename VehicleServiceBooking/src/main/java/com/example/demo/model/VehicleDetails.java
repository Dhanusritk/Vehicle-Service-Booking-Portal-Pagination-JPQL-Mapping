package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Servicedetails")
public class VehicleDetails {
	
	
	private String modelname; 
	private String modelbrand;
	@Id
	private String registrationnumber;
	private String description;
	private LocalDateTime pickuptime;
	private LocalDateTime deliverydate;
	private LocalDateTime deliverytime;
	private String address;
	public VehicleDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleDetails(String modelname, String modelbrand, String registrationnumber, String description,
			LocalDateTime pickuptime, LocalDateTime deliverydate, LocalDateTime deliverytime, String address) {
		super();
		this.modelname = modelname;
		this.modelbrand = modelbrand;
		this.registrationnumber = registrationnumber;
		this.description = description;
		this.pickuptime = pickuptime;
		this.deliverydate = deliverydate;
		this.deliverytime = deliverytime;
		this.address = address;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public String getModelbrand() {
		return modelbrand;
	}
	public void setModelbrand(String modelbrand) {
		this.modelbrand = modelbrand;
	}
	public String getRegistrationnumber() {
		return registrationnumber;
	}
	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getPickuptime() {
		return pickuptime;
	}
	public void setPickuptime(LocalDateTime pickuptime) {
		this.pickuptime = pickuptime;
	}
	public LocalDateTime getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(LocalDateTime deliverydate) {
		this.deliverydate = deliverydate;
	}
	public LocalDateTime getDeliverytime() {
		return deliverytime;
	}
	public void setDeliverytime(LocalDateTime deliverytime) {
		this.deliverytime = deliverytime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
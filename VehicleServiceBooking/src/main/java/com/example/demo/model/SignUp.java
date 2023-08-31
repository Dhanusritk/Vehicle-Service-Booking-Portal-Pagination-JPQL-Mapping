package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="signupdetails")
public class SignUp {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String  getPassword() {
		return password;
	}
	public void setPassword(String  password) {
		this.password = password;
	}
	public List<VehicleDetails> getVh() {
		return vh;
	}
	public void setVh(List<VehicleDetails> vh) {
		this.vh = vh;
	}
	public Feedback getFb() {
		return fb;
	}
	public void setFb(Feedback fb) {
		this.fb = fb;
	}
	public SignUp(String name, long mobileno, String password, List<VehicleDetails> vh, Feedback fb) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.password = password;
		this.vh = vh;
		this.fb = fb;
	}
	@Id
	private long mobileno;
	private String password;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "mobno")
	private List<VehicleDetails> vh;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name= "feedback")
	private Feedback fb;
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
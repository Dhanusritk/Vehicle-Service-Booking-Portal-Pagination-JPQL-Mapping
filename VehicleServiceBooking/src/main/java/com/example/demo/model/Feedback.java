package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedbacktable")
public class Feedback {
	@Id
	private String feedback;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String feedback) {
		super();
		
		this.feedback = feedback;
	}
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
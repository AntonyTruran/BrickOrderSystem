package com.caci.BrickOrderSystem.entities;

import org.springframework.data.annotation.Id;

public class BrickOrder {

	public BrickOrder(String orderReference, int quantity) {
		super();
		this.orderReference = orderReference;
		this.quantity = quantity;
	}
	@Id
	private String orderReference;
	private int quantity;
	//private Boolean dispatched
	public String getOrderReference() {
		return orderReference;
	}
	public void setOrderReference(String orderReference) {
		this.orderReference = orderReference;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

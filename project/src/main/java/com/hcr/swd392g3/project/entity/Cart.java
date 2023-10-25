package com.hcr.swd392g3.project.entity;

public class Cart {
	private int customerID;
	private int menuID;
	private int quantity;
	
	
	
	public Cart() {
	}
	
	public Cart(int customerID, int menuID, int quantity) {
		this.customerID = customerID;
		this.menuID = menuID;
		this.quantity = quantity;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getMenuID() {
		return menuID;
	}
	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

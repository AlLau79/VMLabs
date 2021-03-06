package com.javaoo.store;

public class Item {
	
	private String title;
	private double price;
	private int quantity;
	
	public Item(String title, double price, int quantity) {
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Item() {
		title = "no name";
		price = 10000000.0;
		quantity = 1;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

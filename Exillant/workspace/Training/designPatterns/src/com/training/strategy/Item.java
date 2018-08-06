package com.training.strategy;

public class Item {
	private String itemcode;
	private double price;
	private int quantity;

	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemcode=" + itemcode + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item(String itemcode, double price, int quantity) {
		super();
		this.itemcode = itemcode;
		this.price = price;
		this.quantity = quantity;
	}

}

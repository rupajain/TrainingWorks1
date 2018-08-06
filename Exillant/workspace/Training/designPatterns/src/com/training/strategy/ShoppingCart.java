package com.training.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items;

	public ShoppingCart() {
		// TODO Auto-generated constructor stub
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.items.add(item);

	}

	public void removeItem(Item item) {
		this.items.remove(item);

	}

	public void modifyItemCount(Item item) {

	}

	public double calculateTotal() {
		double sum = 0;
		for (Item item : items) {
			sum = sum + item.getPrice() * item.getQuantity();
		}
		return sum;
	}
	
	public void checkOut(Payment paymentStrategy)
	{
		paymentStrategy.pay(calculateTotal());
	}
	
	
	public void toDo(List Items)
	{
		ShoppingCart csrt=new ShoppingCart();
		for(int i=0;i<items.size();i++)
		{
			csrt.addItem(items.get(i));	
		}
		Payment paymentStrategy=new EWallet("rupa.jain@gmail.com", "dddd", "dddd");
		csrt.checkOut(paymentStrategy);
	}
}

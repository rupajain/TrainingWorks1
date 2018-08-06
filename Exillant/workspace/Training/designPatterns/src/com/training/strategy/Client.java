package com.training.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Item> itemList = Stream.of(new Item("101",23.00,15),
				new Item("101",23.00,15),
				new Item("101",23.00,15)).collect(Collectors.toList());
		
		
		
		
		ShoppingCart shoppingCart=new ShoppingCart();
		shoppingCart.addItem(new Item("ITM101",23.00,15));
		shoppingCart.addItem(new Item("ITM101-monitor",23.00,15));
		shoppingCart.addItem(new Item("ITM101-pen",23.00,15));
		shoppingCart.addItem(new Item("ITM101-bottle",23.00,15));
		
		
		System.out.println("total amount.."+shoppingCart.calculateTotal());
		
		Payment paymentStrategy=new EWallet("rupa.jain@gmail.com", "dddd", "dddd");
		
		
		shoppingCart.checkOut(paymentStrategy);
		
		shoppingCart.toDo(itemList);
	}

}

package com.training.servicelocator;

public class Client {
public static void main(String[] args) {
	Service dbService=ServiceLocator.getService("db");
	dbService.execute();
	System.out.println(".................");
	Service erpService=ServiceLocator.getService("erp");
	erpService.execute();
	
	 dbService=ServiceLocator.getService("db");
	dbService.execute();
	
	erpService=ServiceLocator.getService("erp");
	erpService.execute();
}
}

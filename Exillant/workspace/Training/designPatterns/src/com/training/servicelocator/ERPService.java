package com.training.servicelocator;

public class ERPService implements Service {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "erp";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("executing erp service");
	}

}

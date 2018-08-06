package com.exilant.day2;

public class ExilantEmployee implements iEmployee,IDepartment{

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("the salary is decided by the project you work..");
	}

	@Override
	public void workLocation() {
		// TODO Auto-generated method stub
		System.out.println("richmond ");
	}

	@Override
	public void noofHrs() {
		// TODO Auto-generated method stub
		IDepartment.super.noofHrs();
	}

}

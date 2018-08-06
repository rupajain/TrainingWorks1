package com.training.mvc;

public class DashView implements ViewInterface{
	public void printEmployee(Employee employee)
	{
		System.out.println("empid.."+employee.getEmpId());
		System.out.println("empname.."+employee.getEmpName());
	}
}

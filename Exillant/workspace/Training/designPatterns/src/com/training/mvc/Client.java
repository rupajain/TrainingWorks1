package com.training.mvc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee model=new Employee(101, "Divya");

StarView view=new StarView();
EmployeeController controller=new EmployeeController(model, view);
controller.updateView("star");
	}
private static Employee retrieve()
{
	return new Employee(101, "Divya");
}
}

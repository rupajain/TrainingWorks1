package com.exilant.facade;

public class FacadeCar {
private HatchBack hbc;
private Sedan sedan;
private SUV suv;

public FacadeCar() {
	// TODO Auto-generated constructor stub
	
	this.hbc=new HatchBack();
	this.sedan=new Sedan();
	this.suv=new SUV();
}
public void hatchBackDriver() {
	// TODO Auto-generated method stub
	hbc.drive();

}
public void sedanDrive() {
	// TODO Auto-generated method stub
sedan.drive();
}
public void suvDrive()
{
	suv.drive();
}
}

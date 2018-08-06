package com.training.abstractpattern;

public interface IVehicle {

	void move();

	void speed(int maxSpeed);
	void paint(IColor color);
}

class Car implements IVehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car is moving");

	}

	@Override
	public void speed(int maxSpeed) {
		// TODO Auto-generated method stub
System.out.println("max speed of car is..."+maxSpeed);
	}

	@Override
	public void paint(IColor color) {
		// TODO Auto-generated method stub
		color.paintCar();
	}

}

class Truck implements IVehicle
{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("truck is moving");
	}

	@Override
	public void speed(int maxSpeed) {
		// TODO Auto-generated method stub
		System.out.println("max speed of truck is..."+maxSpeed);
	}

	@Override
	public void paint(IColor color) {
		// TODO Auto-generated method stub
		color.paintCar();
	}
	
}
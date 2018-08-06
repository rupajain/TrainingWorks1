package com.training.factory;

public class factoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car=Car.getcar(CarName.AUDI);
car.drive();
	}

}

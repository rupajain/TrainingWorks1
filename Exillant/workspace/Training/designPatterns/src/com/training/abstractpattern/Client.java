package com.training.abstractpattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory vehicalfactory = FactoryProducer.getFcatory("vehical");
		IVehicle fordCar = vehicalfactory.getVehical("car");
		IColor redColor = FactoryProducer.getFcatory("color").getColor("red");
		fordCar.move();
		fordCar.speed(120);
		fordCar.paint(redColor);
		
		IColor blueColor = FactoryProducer.getFcatory("color").getColor("blue");
		IVehicle manTruck = vehicalfactory.getVehical("truck");
		manTruck.move();
		manTruck.speed(65);
		manTruck.paint(blueColor);

		
		
		
		
		
		
		
	}

}

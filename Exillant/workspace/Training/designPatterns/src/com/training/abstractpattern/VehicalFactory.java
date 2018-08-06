package com.training.abstractpattern;

public class VehicalFactory extends AbstractFactory{

	@Override
	public IVehicle getVehical(String vehical) {
		// TODO Auto-generated method stub
		if(vehical.equals("car"))
		{
			return new Car();
		}else if(vehical.equals("truck"))
		{
			return new Truck();
		}
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}

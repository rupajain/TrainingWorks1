package com.training.abstractpattern;

public class ColorFcatory extends AbstractFactory{
//we shall not have any implemetation of vehical methods
	@Override
	public IVehicle getVehical(String vehical) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		if(color.equals("red"))
		{
			return new Red();
			
		}else if(color.equals("blue"))
		{
			return new Blue();
			
		}
		return null;
	}

}

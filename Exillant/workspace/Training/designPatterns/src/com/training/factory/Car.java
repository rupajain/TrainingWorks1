package com.training.factory;

public abstract class Car {
public static Car getcar(CarName carName)
{
	if(carName==CarName.MARUTI)
	{
		return new Maruti();
	}else if(carName==CarName.BMW)
	{
		return new Bmw();
	}else if(carName==CarName.AUDI)
	{
		return new Audi();
	}
	return null;
	
	
}
public abstract void drive();
}

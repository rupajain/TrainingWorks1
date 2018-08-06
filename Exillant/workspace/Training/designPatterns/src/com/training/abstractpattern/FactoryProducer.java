package com.training.abstractpattern;

public class FactoryProducer {
	public static AbstractFactory getFcatory(String factoryName)
	{
		//if this method is not made static the every time the instance is create it is loaded in heap which would run costly
		//these kind of method are called resource intensive
		if(factoryName.equals("vehical"))
		{
			return new VehicalFactory();
		}else if(factoryName.equals("color"))
		{
			return new ColorFcatory();
		}
		return null;
	}

}

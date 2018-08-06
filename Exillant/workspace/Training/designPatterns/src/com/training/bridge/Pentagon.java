package com.training.bridge;

public class Pentagon extends Shape {

	public Pentagon(IColor color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
System.out.println("pentagon is applying color");
getColor().applyColor();
	}

}

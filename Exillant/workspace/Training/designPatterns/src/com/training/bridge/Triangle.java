package com.training.bridge;

public class Triangle extends Shape {

	public Triangle(IColor color) {
		// TODO Auto-generated constructor stub
		super(color);
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("triangle is applied with color"+getColor());
		getColor().applyColor();
	}

}

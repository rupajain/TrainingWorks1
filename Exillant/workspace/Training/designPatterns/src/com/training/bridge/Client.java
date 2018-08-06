package com.training.bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape traingle=new Triangle(new Red());
traingle.applyColor();

Shape  pentagon=new Pentagon(new Blue());
pentagon.applyColor();
	}

}

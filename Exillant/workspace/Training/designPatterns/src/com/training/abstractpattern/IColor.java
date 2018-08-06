package com.training.abstractpattern;

public interface IColor {
void paintCar();
}
class Red implements IColor{

	@Override
	public void paintCar() {
		// TODO Auto-generated method stub
		System.out.println("car paining color red");
	}
	
}
class Blue implements IColor{

	@Override
	public void paintCar() {
		// TODO Auto-generated method stub
		System.out.println("car paining color blue");
	}
	
}

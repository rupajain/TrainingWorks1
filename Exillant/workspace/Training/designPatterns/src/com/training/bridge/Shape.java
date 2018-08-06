package com.training.bridge;
//this shall be treaed as abstract class
//since the refernce of the color is kept here
//every shape shall have color
public abstract class Shape {
private IColor color;

public Shape(IColor color)
{
this.color=color;	
}

public IColor getColor() {
	return color;
}



public abstract void applyColor();

}

package com.exilant.day2;

public interface iEmployee {
public void salary();

public default void noofHrs()
{
	System.out.println("every employee has to work for 8 hrs..");
}
}

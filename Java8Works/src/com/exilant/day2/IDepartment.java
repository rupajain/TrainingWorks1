package com.exilant.day2;

public interface IDepartment {
public void workLocation();

default void noofHrs()
{
	System.out.println("the project demands to work only till 6pm");
}
public static void commonUtility()
{
	System.out.println("All employee have to pass backgroung verification");
}

}

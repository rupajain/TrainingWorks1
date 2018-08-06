package com.exilant.day1;

public class LambdaThread04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi I am from Ananymous call....start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("anonymous call exiting");
	}
}).start();
/////lambda expresiion based
//new Thread(()->System.out.println("Hi I'm from Lambda"));

////
new Thread(()->
{
	System.out.println("hi I ma from Lambda");
	try
	{
		Thread.sleep(1000);
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}).start();
	}

}

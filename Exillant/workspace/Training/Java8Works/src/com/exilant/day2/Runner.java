package com.exilant.day2;
//all business logic goes here...
public class Runner {
public void execute(WorkerInterface workerinterface)
{
	System.out.println("in exxecuet method");
	workerinterface.doSomeWork();
}
}

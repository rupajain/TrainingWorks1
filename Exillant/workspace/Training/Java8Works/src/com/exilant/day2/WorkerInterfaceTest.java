package com.exilant.day2;

public class WorkerInterfaceTest {
public static void main(String[] args) {
	Runner runner=new Runner();
	runner.execute( new WorkerInterface() {
		
		@Override
		public void doSomeWork() {
			// TODO Auto-generated method stub
			System.out.println("hi we are doing some  extra work in main");
			
		}
	});
	runner.execute(()->System.out.println("Hi I am in lambda way in main"));
	runner.execute(()->{
		System.out.println("In lambda way,in multiple lines");
		System.out.println("you can any business logic here..");
	});
}
}

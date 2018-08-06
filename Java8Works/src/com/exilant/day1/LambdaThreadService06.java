package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hi I am in annonymous block");
			}
		});
		executorService.shutdown();
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();

		executorService1.execute(() -> {
			System.out.println("i am in lambda block");
		});
		
		executorService1.shutdown();
		System.out.println("...callable work...");
		ExecutorService executorService2=Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables=initializeCallables();
		try {
//			String result=executorService2.invokeAny(callables);
//			System.out.println("result:"+result);
			List<Future<String>>results=executorService2.invokeAll(callables);
			for(Future temp:results)
			{
				try {
					System.out.println(temp.get());
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			executorService2.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	//this method will create set of callables(each callable in 1 thread)
	//this method  will scafold the threads in real world
	public static Set<Callable<String>> initializeCallables(){
		Set<Callable<String>> callables=new HashSet<Callable<String>>();
		callables.add(()->"1st callable..");
		callables.add(()->"2nd  callable..");
		callables.add(()->"3rd callable..");
		callables.add(()->"4th callable..");
		callables.add(()->"5th callable..");
		callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "callable  threads in anonymous classs";
			}
		});
		callables.add(()->{return "complex called business logic";});
		return callables;
	}
	

}

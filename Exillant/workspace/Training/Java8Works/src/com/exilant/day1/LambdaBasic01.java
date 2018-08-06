package com.exilant.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaBasic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> numbers=Arrays.asList(10,20,30,40,50,60);

//<jdk1.5
for(int i=0;i<numbers.size();i++)
{
	System.out.println(numbers.get(i));
}
System.out.println("post jdk 1.5");
//till jdk1.7
for(Integer temp:numbers)
{
	System.out.println(temp);
}

//from jdk1.8 with lambda
numbers.forEach((Integer temp)->System.out.println(temp));
//behind the screen
   numbers.forEach(new Consumer<Integer>() {
	   @Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
});
   //in lambda way 1.8
   
   System.out.println("... in lambda way(01)");
   numbers.forEach((temp)->System.out.println(temp));;
   
   //this is called as method references
   System.out.println("in lambda way ()02");
   numbers.forEach(System.out::println);
   
	
	
	//sum of numbers
   int sum=0;
	for(int i=0; i<numbers.size();i++)
	{
		sum=sum+numbers.get(i);
	}
	System.out.println("sum of numbers by for loop"+sum);
//
	sum=0;
	for (Integer integer : numbers) {
		sum=sum*2+integer;
	}
	System.out.println("sum of numbers by for each"+sum);
	
	//System.out.println(numbers.stream().map(e->e*2).reduce(accumulator));
	System.out.println(numbers.stream().
			map(e->e*2).
			reduce((res,e)->res+e));
	
	
}
}

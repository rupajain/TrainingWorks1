package com.exilant.day1;
//if you have an interface and that interface is having exactly one method then that interface can be eligible to be function interface

import java.util.Arrays;
import java.util.function.Consumer;

@FunctionalInterface
interface MathOperation{
	int operation(int num1,int num2);
}
public class LambdaEx03 {
public static int operate(int num1,int num2,MathOperation opr)
{
	return opr.operation(num1, num2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MathOperation add=(int num1,int num2)->num1+num2;
MathOperation sub=(int num1,int num2)->num1-num2;
System.out.println(operate(10, 20, add));
System.out.println(operate(20, 30, sub));



MathOperation m1=new MathOperation() {
	
	@Override
	public int operation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
};


MathOperation m2=(num1,num2)->(num1+num2);

MathOperation m3=(num1,num2)->(num1+num2);
System.out.println(m3.operation(20, 30));

//Arrays.asList(1,2,3,4).forEach(new Consumer<T>() {
//
//	@Override
//	public void accept(T t) {
//		// TODO Auto-generated method stub
//		
//	}
//});
//
	}

}

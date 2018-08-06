package com.training.aop.banking;

import org.aopalliance.aop.Advice;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//this will scan for any package configured
	//this will scan any class
	//@Before("execution(public double getBalance())")
	
	
	
	//we can also have fully qualified name
	
	//@Before("execution(public double com.training.aop.model.CAAcount.showBalance())")
	//@Before("execution(public double com.training.aop.model")
	//@Before("execution( * get*())")
	//@Before("execution( * get*(*))")
	//@Before("execution( * get*(..))")
	//@Before("execution( * com.training.aop.model.*.get*(..))")
	@Before("execution( * com.training.aop.model.*.getBalance())")
public void loggingAdviceBefore() {
	System.out.println("************logging before called**************");
}
//	@After("execution(public double getBalance())")
//	public void loggingAdviceAfter() {
//		System.out.println("************logging after called**************");
//	}
	@Pointcut("execution(* get*(..))")
	public void allGetters()
	{
		System.out.println("************this wioll not be dispalyed************");
	}
	 @Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("************second aspect invoked for all getters************");	
	}
	 
	 
	 @Before("allGettersSBAccount()")
		public void secondAdviceForSbAccount()
		{
			System.out.println("************second aspect invoked for all getters of sb account************");	
		}
	 @Pointcut("execution(* com.training.aop.model.SBAccount.getAcc())")
		public void allGettersSBAccount()
		{
			System.out.println("************this wioll not be dispalyed************");
		}
	@Before("allGetters() || allGettersSBAccount()")
	 public void compondAdvice()
	 {
		 System.out.println("this is compond Advice.class.");
	 }
	 
}

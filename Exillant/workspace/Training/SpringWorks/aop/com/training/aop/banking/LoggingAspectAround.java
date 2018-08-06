package com.training.aop.banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {
	@Around("execution(public * get*())")
public Object sampleMyAroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
{
	//this advice should have complusory argument

	Object retVal=null;
	
	try {
		System.out.println("before job goes here..");
		retVal =  proceedingJoinPoint.proceed();
		System.out.println("after job goes here..");
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return retVal;
}
}

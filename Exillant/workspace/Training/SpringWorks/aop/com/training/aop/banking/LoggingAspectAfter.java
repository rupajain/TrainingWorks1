package com.training.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfter {
	@After("execution(* get*())")
	public void afterGetter() {
		System.out.println("$$$$$$$ after advice onvoked..");
	}

	@AfterReturning("execution(* com.training.aop.model.SBAccount.getAcc())")
	public void aftersuccessfullGetter() {
		System.out.println("$$$$$$$ after successful advice onvoked..");
	}
@AfterReturning(pointcut="args(val)",returning="returnString")
public void afterReturnStringSetter(String val,String returnString)
{
	System.out.println("after invoked for input ->"+val+", return ->"+returnString);
}

@AfterThrowing("execution(* throw*())")
public void afterException()
{
	System.out.println(" this is invoked for alll exception ...");
}

}

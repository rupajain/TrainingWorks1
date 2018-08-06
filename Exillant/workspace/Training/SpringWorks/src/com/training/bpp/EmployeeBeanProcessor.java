package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.employee.Employee;
//if you want spring to know this is post processor implement
// beanpostprocessor this way every bean when create by
//spring has to go through this class

//since this class can handle any class 
public class EmployeeBeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub

		System.out.println("**********postProcessBeforeInitialization...." + beanName);
		
		if(bean instanceof Employee)
		{
			System.out.println("**********postProcessBeforeInitialization condition...." + beanName);
			Employee emp=(Employee)bean;
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("**********postProcessAfterInitialization...." + beanName);
		return bean;
	}
	
	

}

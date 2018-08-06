package com.training.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basics.HelloService;

public class Client {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-context1.xml");
		
		//AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-context1.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml","spring-context1.xml");
		Employee employee = context.getBean("employee", Employee.class);

		System.out.println("emp id " + employee.getEmpId());
		System.out.println("emp name " + employee.getEmpName());
		System.out.println("emp sal " + employee.getEmpSal());
		
		System.out.println(employee.hashCode());
		System.out.println("................");

		employee = context.getBean("employee", Employee.class);

		System.out.println("emp id " + employee.getEmpId());
		System.out.println("emp name " + employee.getEmpName());
		System.out.println("emp sal " + employee.getEmpSal());
		
		System.out.println(employee.hashCode());
		System.out.println("................");

		employee = context.getBean("employee", Employee.class);

		System.out.println("emp id " + employee.getEmpId());
		System.out.println("emp name " + employee.getEmpName());
		System.out.println("emp sal " + employee.getEmpSal());
		
		System.out.println(employee.hashCode());
		System.out.println("................");
		
		
		
		
		HelloService service=(HelloService)context.getBean("defaultHello");
		System.out.println(service.sayHello());
		System.out.println(service.hashCode());
		
		context.registerShutdownHook();
	}
}

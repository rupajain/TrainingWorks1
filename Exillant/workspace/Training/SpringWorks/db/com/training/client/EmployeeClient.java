package com.training.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Employee;
import com.training.entity.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("db-context.xml");
		IEmployeeDAO employeeDao = (IEmployeeDAO) context.getBean("employeeDaoTemplate");
		// insert employee
		
		Employee emp1=new Employee(101, "chanidimni", 22222);
		 Employee emp2=new Employee(102, "divya", 22222);
		 Employee emp3=new Employee(103, "purva", 22222);
		 Employee emp4=new Employee(104, "rupa", 22222);
		
		 employeeDao.insertEmployee(emp1);
		 employeeDao.insertEmployee(emp2);
		 employeeDao.insertEmployee(emp3);
		 employeeDao.insertEmployee(emp4);
		

//		Employee emp = employeeDao.getEmployee(101);
//		System.out.println(emp);
//		employeeDao.deleteEmployee(101);
//		List<Employee> list = employeeDao.getAllEmps();
//		list.forEach(System.out::println);
//		
		
		
//		employeeDao.updateEmployee(101, 33000000);
	}
}

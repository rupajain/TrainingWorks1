package com.training.singleton;
//this program to show working of lazy singleton



class Company
{
	private  Company()
	{
		System.out.println("construvctor called..");
	}
	
	public static Company getInstance(Company company)
	{
		if(company==null)
		{
		return new Company();	
		}
		return company;
	}
}

class Emp
{
	int empId;
	String empName;
	Company company;
	
}
public class SingletonClient02 {
public static void main(String[] args) {
	//you can not create instance of variabl;e
	//Company company=new Company();
	Company company=null;
	company=company.getInstance(company);
	Emp emp1=new Emp();
	emp1.empId=101;
	emp1.empName="Rupa";
	emp1.company=company;
	System.out.println(emp1.company.hashCode());
	
	Emp emp2=new Emp();
	emp2.empId=102;
	emp2.empName="Divya";
	emp2.company=company;
	System.out.println(emp2.company.hashCode());
	
	
	Emp emp3=new Emp();
	emp3.empId=103;
	emp3.empName="Birendra";
	emp3.company=company;
	System.out.println(emp3.company.hashCode());
}
}

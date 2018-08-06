package com.training.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer customer1=new Customer(101 , "Birendra");
Customer customer2=new Customer(102 , "Lohit");
Customer customer3=new Customer(103 , "divya");
Customer customer4=new Customer(104 , "rupa");
Customer customer5=new Customer(105 , "ankit");

Customer customer6=new Customer(106 , "shubha");
Customer customer7=new Customer(107 , "akshaya");


customer1.addRefernce(customer2);
customer1.addRefernce(customer3);
customer1.addRefernce(customer4);
customer1.addRefernce(customer5);
customer1.addRefernce(customer6);
customer1.addRefernce(customer7);

System.out.println("print all customer refernce tree");
System.out.println("customer1 refernce...");

for(Customer temp:customer1.getReferences())
{
System.out.println(temp.getCustId()+"..."+temp.getCustname());	
}
	}

}

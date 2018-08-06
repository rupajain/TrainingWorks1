package com.training.servicelocator;
//this class will work for any service
public class InitialContext {
public Object lookup(String jndiname)
{
	if(jndiname.equalsIgnoreCase("db"))
	{
		System.out.println("looking for db service and creating");
		return new DBService();
	}else if(jndiname.equalsIgnoreCase("erp"))
	{
		System.out.println("looking for erp service and creating");
		return new ERPService();
	}
	return null;
}
}

package com.exilant.day2;

import java.util.function.Consumer;

public class PersonConsumer implements Consumer<Person> {

	@Override
	public void accept(Person t) {
		// TODO Auto-generated method stub
		System.out.println("person id: "+t.getpId()
		+",Person name.."+t.getName());
	}
	
	static class PrintConsumer{
		public  static void print(Person p)
		{
			System.out.println("static->"+p.getpId()+"...."+p.getName());
		}
	}

}

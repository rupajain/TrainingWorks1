package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Married implements ICriteria{

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> marriedlist=new ArrayList<Person>();
		for(Person temp:persons)
		{
			if(temp.getMaritalStatus().equals("married"))
			{
				marriedlist.add(temp);
			}
		}
		return marriedlist;
	}

}

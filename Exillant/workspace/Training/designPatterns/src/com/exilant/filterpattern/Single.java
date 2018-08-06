package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Single implements ICriteria{

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> unmarriedlist=new ArrayList<Person>();
		for(Person temp:persons)
		{
			if(temp.getMaritalStatus().equals("single"))
			{
				unmarriedlist.add(temp);
			}
		}
		return unmarriedlist;

	}

}

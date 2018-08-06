package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Male implements ICriteria{

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malelist=new ArrayList<Person>();
		for(Person temp:persons)
		{
			if(temp.getSex().equals("male"))
			{
				malelist.add(temp);
			}
		}
		return malelist;
	}

}

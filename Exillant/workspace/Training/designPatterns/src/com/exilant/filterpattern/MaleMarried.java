package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class MaleMarried implements ICriteria{

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> malemarriedlist=new ArrayList<Person>();
		for(Person temp:persons)
		{
			if(temp.getSex().equals("male")&&temp.getMaritalStatus().equals("married"))
			{
				malemarriedlist.add(temp);
			}
		}
		return malemarriedlist;
	}
	

}

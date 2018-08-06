package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Female implements ICriteria{

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> femalelist=new ArrayList<Person>();
		for(Person temp:persons)
		{
			if(temp.getSex().equals("female"))
			{
				femalelist.add(temp);
			}
		}
		return femalelist;
	}

}

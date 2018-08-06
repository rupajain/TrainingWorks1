package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class MaleSingle implements ICriteria{

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		List<Person> malesinglelist=new ArrayList<Person>();
		for(Person temp:persons)
		{
			if(temp.getSex().equals("male")&&temp.getMaritalStatus().equals("single"))
			{
				malesinglelist.add(temp);
			}
		}
		return malesinglelist;
	}

}

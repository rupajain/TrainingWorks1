package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class NegativeCriteraia implements ICriteria {
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;

	public NegativeCriteraia(ICriteria firstCriteria) {
		// TODO Auto-generated constructor stub
		this.firstCriteria=firstCriteria;
	}

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> negativelist=persons;
		List<Person> negativelist1=new ArrayList<Person>();
		
		for(Person temp:persons)
		{
			negativelist1.addAll(this.firstCriteria.meetCirteria(persons));
			
			
		}
		//negativelist.removeAll(firstCriteria.meetCirteria(persons));
		
		System.out.println("......"+negativelist1);
		negativelist.removeAll(negativelist1);
		
		System.out.println("......"+negativelist);
		return negativelist;
	}
}

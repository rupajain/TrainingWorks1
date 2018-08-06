package com.exilant.filterpattern;

import java.util.List;

public class AndCriteria implements ICriteria{
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;
	
	public AndCriteria(ICriteria firstCriteria,ICriteria secondCriteria)
	{
		super();
		this.firstCriteria=firstCriteria;
		this.secondCriteria=secondCriteria;
	}

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		// TODO Auto-generated method stub
		
		List<Person> andList=firstCriteria.meetCirteria(persons);
		return secondCriteria.meetCirteria(andList);
	}

}

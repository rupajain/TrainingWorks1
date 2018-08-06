package com.exilant.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements ICriteria {
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;

	public OrCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> meetCirteria(List<Person> persons) {
		// TODO Auto-generated method stub

		List<Person> orList1 = firstCriteria.meetCirteria(persons);
		List<Person> orList2 = secondCriteria.meetCirteria(persons);
		//orList1.addAll(orList2);
		for (Person temp : orList2) {
			if (!orList1.contains(temp)) {
				orList1.add(temp);
			}
		}
		return orList1;
	}

}

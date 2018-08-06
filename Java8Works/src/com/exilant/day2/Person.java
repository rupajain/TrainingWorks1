package com.exilant.day2;

public class Person {
private int pId;
private String name;
public int getpId() {
	return pId;
}





@Override
public String toString() {
	return "Person [pId=" + pId + ", name=" + name + "]";
}


public Person(int pId, String name) {
	super();
	this.pId = pId;
	this.name = name;
}


public void setpId(int pId) {
	this.pId = pId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}

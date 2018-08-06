package com.training.airlines.bookingtickets.registeruser;

import java.io.Serializable;

public class PassengerInfo implements Serializable{
private String name;
private Integer age;
private String ID;
private IDType IDType;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public IDType getIDType() {
	return IDType;
}
public void setIDType(IDType iDType) {
	IDType = iDType;
}
public PassengerInfo(String name, Integer age, String iD,
		com.training.airlines.bookingtickets.registeruser.IDType iDType) {
	super();
	this.name = name;
	this.age = age;
	ID = iD;
	IDType = iDType;
}
public PassengerInfo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PassengerInfo [name=" + name + ", age=" + age + ", ID=" + ID + ", IDType=" + IDType + "]";
}

}

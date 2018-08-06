package com.training;

import com.mongodb.BasicDBObject;

public class Employee extends BasicDBObject{
private int empid;

private String empname;
private double empsal;

private String empemail;
  public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String empName, double empsal, String empemail) {
	super();
	this.empid = empId;
	this.empname = empName;
	this.empsal = empsal;
	this.empemail = empemail;
}
public int getEmpId() {
	return empid;
}
public void setEmpId(int empId) {
	this.put("empid", empid);
	this.empid = empId;
}
public String getEmpName() {
	return empname;
}
public void setEmpName(String empName) {
	this.put("empName", empName);
	this.empname = empName;
}
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.put("empsal", empsal);
	this.empsal = empsal;
}
public String getEmpemail() {
	return empemail;
}
public void setEmpemail(String empemail) {
	this.put("empemail", empemail);
	this.empemail = empemail;
}
@Override
public String toString() {
	return "Employee [empId=" + empid + ", empName=" + empname + ", empsal=" + empsal + ", empemail=" + empemail + "]";
}
  
}

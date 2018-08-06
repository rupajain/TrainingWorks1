package com.exilant.day1;

public class Customer {
	private int custId;
	private String CustName;
	private double custPurchases;
	private String designation;
public static void main(String[] args) {
	
}
public Customer(int custId, String custName, double custPurchases, String designation) {
	super();
	this.custId = custId;
	CustName = custName;
	this.custPurchases = custPurchases;
	this.designation = designation;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return CustName;
}
public void setCustName(String custName) {
	CustName = custName;
}
public double getCustPurchases() {
	return custPurchases;
}
public void setCustPurchases(double custPurchases) {
	this.custPurchases = custPurchases;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", CustName=" + CustName + ", custPurchases=" + custPurchases
			+ ", designation=" + designation + "]";
}
}

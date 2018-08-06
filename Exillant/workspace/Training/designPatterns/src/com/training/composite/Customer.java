package com.training.composite;

import java.util.ArrayList;
import java.util.List;

public class Customer {
private int custId;
private String custname;
private List<Customer> references;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public List<Customer> getReferences() {
	return references;
}
public void setReferences(List<Customer> references) {
	this.references = references;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custname=" + custname + ", references=" + references + "]";
}
public Customer(int custId, String custname) {
	super();
	this.custId = custId;
	this.custname = custname;
	this.references = new ArrayList<Customer>();
}
public void addRefernce(Customer customer)
{
this.references.add(customer)
;}
public void removeRefernce(Customer customer)
{
this.references.remove(customer)
;}



}

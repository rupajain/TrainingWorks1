package com.exilant.day1;

public class PriorityCustomer {
	private int custmerId;
	private String custName;
	private String type;
	
	public PriorityCustomer() {
		// TODO Auto-generated constructor stub
	}

	public PriorityCustomer(int custmerId, String custName, String type) {
		super();
		this.custmerId = custmerId;
		this.custName = custName;
		this.type = type;
	}

	public int getCustmerId() {
		return custmerId;
	}

	public void setCustmerId(int custmerId) {
		this.custmerId = custmerId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PriorityCustomer [custmerId=" + custmerId + ", custName=" + custName + ", type=" + type + "]";
	}
	

}

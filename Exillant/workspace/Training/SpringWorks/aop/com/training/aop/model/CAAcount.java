package com.training.aop.model;

public class CAAcount {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double showBalance() {
		this.getTest();
		return account.getBalance();
	}
	
	void getTest()
	{
		System.out.println("this is default test..");
	}
	
public String	getOneparam(int a)
	{
		System.out.println("with one param...." +a);
		return "s";
	}
}

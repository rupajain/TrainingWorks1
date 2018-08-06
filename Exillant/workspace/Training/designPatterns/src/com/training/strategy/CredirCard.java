package com.training.strategy;

public class CredirCard implements Payment {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateofExpiry;
	private double discount;
	private String bankName;

	public CredirCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CredirCard(String name, String cardNumber, String cvv, String dateofExpiry, double discount,
			String bankName) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateofExpiry = dateofExpiry;
		this.discount = discount;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "CredirCard [name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", dateofExpiry="
				+ dateofExpiry + ", discount=" + discount + ", bankName=" + bankName + "]";
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		if (this.bankName.equalsIgnoreCase("hdfc")) {
			amount = (int) (amount - (amount * 0.1));
			System.out.println("paying with hdfc and got discount of 10%,paid" + amount);
		} else {
			System.out.println("paid amounnt of ... " + amount + "with credit card.." + cardNumber);
		}
	}

}

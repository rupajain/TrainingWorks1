package com.training.airlines.bookingtickets.registeruser;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Booking implements Serializable{
	private Integer bookig_id;
	public Integer getBookig_id() {
		return bookig_id;
	}
	public void setBookig_id(Integer bookig_id) {
		this.bookig_id = bookig_id;
	}
	private String originCity;
	private String destinationCity1;
	private String destinationCity2;
//	private Date departDate;
//	private Date returnDate;
	
	private String departDate;
	private String returnDate;
	private Integer noOfPassengers;
	private double amount;
	private String journeyType;
	private PassengerInfo passengerInfo;
	private double discount;
	public String getOriginCity() {
		return originCity;
	}
	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}
	public String getDestinationCity1() {
		return destinationCity1;
	}
	public void setDestinationCity1(String destinationCity1) {
		this.destinationCity1 = destinationCity1;
	}
	public String getDestinationCity2() {
		return destinationCity2;
	}
	public void setDestinationCity2(String destinationCity2) {
		this.destinationCity2 = destinationCity2;
	}
	public String getDepartDate() {
		return departDate;
	}
	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getJourneyType() {
		return journeyType;
	}
	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Booking(Integer bookig_id, String originCity, String destinationCity1, String destinationCity2,
			String departDate, String returnDate, Integer noOfPassengers, double amount, String journeyType,
			PassengerInfo passengerInfo, double discount) {
		super();
		this.bookig_id = bookig_id;
		this.originCity = originCity;
		this.destinationCity1 = destinationCity1;
		this.destinationCity2 = destinationCity2;
		this.departDate = departDate;
		this.returnDate = returnDate;
		this.noOfPassengers = noOfPassengers;
		this.amount = amount;
		this.journeyType = journeyType;
		this.passengerInfo = passengerInfo;
		this.discount = discount;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [bookig_id=" + bookig_id + ", originCity=" + originCity + ", destinationCity1="
				+ destinationCity1 + ", destinationCity2=" + destinationCity2 + ", departDate=" + departDate
				+ ", returnDate=" + returnDate + ", noOfPassengers=" + noOfPassengers + ", amount=" + amount
				+ ", journeyType=" + journeyType + ", passengerInfo=" + passengerInfo + ", discount=" + discount + "]";
	}
	

	

}

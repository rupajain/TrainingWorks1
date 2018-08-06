package com.exilant.day2.stats;

public class Dragon {
	private String name;
	private String country;
	private int count;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Dragon [name=" + name + ", country=" + country + ", count=" + count + "]";
	}
	public Dragon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dragon(String name, String country, int count) {
		super();
		this.name = name;
		this.country = country;
		this.count = count;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}

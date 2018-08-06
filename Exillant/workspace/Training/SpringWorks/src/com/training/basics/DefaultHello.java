package com.training.basics;

public class DefaultHello implements HelloService {

	private String name;
	private String city;

	public DefaultHello() {

	}

	public DefaultHello(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return sayHello(name, city);
	}

	// the values for this is given by configuration files
	@Override
	public String sayHello(String name, String city) {
		// TODO Auto-generated method stub

		String myStrs[] = { "hey how r %s  u goood morning whats your city  %s ", "good morning %s ,are you  in %s",
				"mr/ms/mrs %s", "your city is beautiful %s ", "bye %s", "see you %s in %s" };

		int randomnumber = (int) (Math.random() * 3);
		System.out.println("random number.." + randomnumber);

		return String.format(myStrs[randomnumber], name, city);
	}

	public void ginit() {
		System.out.println(" global init for defaulthello goes here");

	}

	public void gdestroy() {
		System.out.println(" global destroy for defaultdestroy goes here");

	}
}

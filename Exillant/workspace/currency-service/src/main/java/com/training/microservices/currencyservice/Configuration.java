package com.training.microservices.currencyservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// prefix the variables used in the application properties
@ConfigurationProperties("currency-service")
public class Configuration {
	private int intr;
	private int usd;

	public int getIntr() {
		return intr;
	}

	public void setIntr(int intr) {
		this.intr = intr;
	}

	public int getUsd() {
		return usd;
	}

	public void setUsd(int usd) {
		this.usd = usd;
	}

	public Configuration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Configuration(int intr, int usd) {
		super();
		this.intr = intr;
		this.usd = usd;
	}

}

package com.training.aop.service;

import javax.management.RuntimeErrorException;

import com.training.aop.model.CAAcount;
import com.training.aop.model.SBAccount;

public class BankingService {
	private SBAccount sbAccount;
	private CAAcount caacount;

	public SBAccount getSbAccount() {
		return sbAccount;
	}

	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}

	public CAAcount getCaacount() {
		return caacount;
	}

	public void setCaacount(CAAcount caacount) {
		this.caacount = caacount;
	}

	@Override
	public String toString() {
		return "BankingService [sbAccount=" + sbAccount + ", caacount=" + caacount + "]";
	}

	public String setAndGet(String name) {
		return "Hello mr/ms/mrs " + name;
	}

	public void throwSomeException() {
		int a = 1;
		if (a == 1) {
			throw new RuntimeException();
		}
		System.out.println("user is ok with value");
	}
}

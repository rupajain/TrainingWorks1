package com.training.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.aop.model.Account;
import com.training.aop.service.BankingService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("aspect-context.xml");
		BankingService bankingService = (BankingService)context.getBean("banking",BankingService.class);
		//Account account = context.getBean("account1", Account.class);

		System.out.println(bankingService.getSbAccount().getAcc().getAccName());
		System.out.println(bankingService.getCaacount().showBalance());
		System.out.println(bankingService.getSbAccount().getAcc().getBalance());
		System.out.println(bankingService.getCaacount().getOneparam(100));

		
		String retVal=bankingService.setAndGet("harry");
		System.out.println("rerurn val in main"+retVal);
		
		bankingService.throwSomeException();
	}

}

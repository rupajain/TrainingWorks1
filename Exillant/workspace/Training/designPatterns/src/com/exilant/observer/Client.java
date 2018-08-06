package com.exilant.observer;

public class Client {
	public static void main(String[] args) {
		IObservable observable = new OnePlust6t();
		IObservable observable1 = new IPhone7();

		IObserver user1 = new User(observable, "kumar");
		IObserver user2 = new User(observable, "Anuj");
		IObserver user3 = new User(observable, "divya");
		IObserver user4 = new User(observable, "rupa");
		IObserver user5 = new User(observable, "shubha");

		observable.adduser(user1);
		observable.adduser(user2);
		observable.adduser(user3);
		observable.adduser(user4);
		observable.adduser(user5);

		observable1.adduser(user1);
		observable1.adduser(user2);
		observable1.adduser(user3);
		observable1.adduser(user4);
		observable1.adduser(user5);
		
		
		((OnePlust6t) observable).setArrived(true);
		System.out.println("...................");
		((IPhone7) observable1).setArrived(true);
		
//		if (((OnePlust6t) observable).isArrived()) {
//			((OnePlust6t) observable).setArrived(true);
//		} else if (((IPhone7) observable1).isArrived()) {
//
//			((IPhone7) observable1).setArrived(true);
//		}
	}
}

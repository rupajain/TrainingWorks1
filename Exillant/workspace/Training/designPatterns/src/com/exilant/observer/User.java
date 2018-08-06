package com.exilant.observer;

public class User implements IObserver {

	private IObservable observable = null;
	private String name;

	public User(IObservable observable, String name) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		this.name = name;

	}

	private void buyMobile() {
		// TODO Auto-generated method stub
		System.out.println("hurry, i bought" + name);

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		buyMobile();
	}

	private void unSubscribe() {
		// TODO Auto-generated method stub
		observable.remove(this);
	}

}

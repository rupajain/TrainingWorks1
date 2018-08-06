package com.exilant.observer;

import java.util.ArrayList;
import java.util.List;

public class OnePlust6t implements IObservable {
	private List<IObserver> users;
	private boolean isArrived = true;

	@Override
	public void adduser(IObserver observer) {
		// TODO Auto-generated method stub
		users.add(observer);
	}

	public OnePlust6t() {
		super();
		this.users=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void remove(IObserver observer) {
		// TODO Auto-generated method stub
		users.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (IObserver temp : users) {
			temp.update();
		}
	}

	public boolean isArrived() {
		return isArrived;
	}

	public void setArrived(boolean isArrived) {
		this.isArrived = isArrived;
		notifyObserver();
	}

}

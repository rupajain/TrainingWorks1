package com.exilant.observer;

import java.util.ArrayList;
import java.util.List;

public class IPhone7 implements IObservable {
	private List<IObserver> users;
	private boolean isArrived = true;
	
	public IPhone7() {
		// TODO Auto-generated constructor stub
		super();
		this.users=new ArrayList<>();
	}
	
	@Override
	public void adduser(IObserver observer) {
		// TODO Auto-generated method stub
		users.add(observer);
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

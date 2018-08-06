package com.exilant.observer;

;
//on which the user is interested
public interface IObservable {
public void adduser(IObserver observer);
public void remove(IObserver observer);

//all those people who are in the list
public void notifyObserver();
}

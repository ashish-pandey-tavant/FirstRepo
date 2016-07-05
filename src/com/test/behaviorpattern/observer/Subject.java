package com.test.behaviorpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	public List<Observer> observerList = new ArrayList<Observer>();
	private int state;
	public List<Observer> getObserverList() {
		return observerList;
	}
	public void setObserverList(List<Observer> observerList) {
		this.observerList = observerList;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	
   private void notifyAllObserver(){
	 
	 for(Observer obj : observerList){	 
		 obj.update();
	 }
   }
   
   public void attach(Observer observer){
	    observerList.add(observer);		
	   }
}

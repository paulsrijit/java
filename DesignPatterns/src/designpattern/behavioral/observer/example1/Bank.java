package designpattern.behavioral.observer.example1;

import java.util.List;
import java.util.ArrayList;

public class Bank implements MySubject {

	List<MyObserver> bankObservers;
	int interestRate = -1;

	public Bank() {
		bankObservers = new ArrayList<>();
	}

	public void updateInterestRate(int interestRate){
			this.interestRate = interestRate;
			notifyObservers();
	}

	//1 register
	public void registerObserver(MyObserver observer){
		bankObservers.add(observer);
	}

	//2 un-register
	public void unregisterObserver(MyObserver observer){
		bankObservers.remove(observer);
	}

	//3 notify observers
	public void notifyObservers(){
		System.out.println("Notifying observers");
		bankObservers.forEach(obj -> obj.update(interestRate));
	}
}
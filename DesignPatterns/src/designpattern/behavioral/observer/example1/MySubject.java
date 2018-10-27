package designpattern.behavioral.observer.example1;
public interface MySubject {
	//1 register
	void registerObserver(MyObserver observer);

	//2 un-register
	void unregisterObserver(MyObserver observer);

	//3 notify observers
	void notifyObservers();

	void updateInterestRate(int interestRate);
}
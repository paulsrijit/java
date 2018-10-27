package designpattern.behavioral.observer.example2;

public interface MySubject {
	void registerObserver(Student observer);
	
	void unregisterObserver(Student observer);
	
	void notifyObservers();
}

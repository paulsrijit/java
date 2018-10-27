package designpattern.behavioral.observer.javabuiltin;

import java.util.Observable;
import java.util.Observer;

/* 
1.	There needs to be at least two classes (Observer and Subject) along with a main class.
2.	Observer should implement java.util.Observer
	a.	Observer will have an instance of Subject. The subject will be assigned/ valued at the time of creating Observer instance.
	b.	Observer needs to override the void update(Observable ovl, Object obj) method
	c.	The update method will check whether the ovl object and the Subject present in its class are equal or not? If equals that means instance of Subject has been updated already and it’s new value can be read/ used from it.
3.	Subject should extend java.util.Observable
	Subject should have an entity. When the entity changes state the setChanged method and notifyObservers method should be called.
*/

public class BuiltInObserverDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		AccountHolder acHolder = new AccountHolder(bank);
		bank.addObserver(acHolder);
		bank.setInterestRate(8);
	}

}

class AccountHolder implements Observer {

	private Bank bank = null;

	public AccountHolder(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void update(Observable subject, Object obj) {
		if (subject == bank) {
			System.out.println("Interest rate updates from Bank to Account Holder : " + bank.getInterestRate());
		}

	}

}

class Bank extends Observable {
	private int interestRate = -1;

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
		setChanged();
		notifyObservers();
	}
}

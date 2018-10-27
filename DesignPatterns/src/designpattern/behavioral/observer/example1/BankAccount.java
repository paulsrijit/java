package designpattern.behavioral.observer.example1;
public class BankAccount implements MyObserver{
	public void update(int interestRate){
		System.out.println("BankAccount oberver updated : "+interestRate);
	}
}
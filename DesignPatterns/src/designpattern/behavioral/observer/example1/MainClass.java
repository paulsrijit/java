package designpattern.behavioral.observer.example1;
public class MainClass {
	public static void main(String args[]){
		MyObserver news1 = new NewsPaper();
		MyObserver acc1 = new BankAccount();
		MySubject bank = new Bank();

		bank.registerObserver(news1);
		bank.registerObserver(acc1);

		bank.updateInterestRate(8);
	}
}
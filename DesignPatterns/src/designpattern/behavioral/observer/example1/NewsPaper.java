package designpattern.behavioral.observer.example1;
public class NewsPaper implements MyObserver{
	public void update(int interestRate){
		System.out.println("NewsPaper Observer updated : "+interestRate);
	}
}
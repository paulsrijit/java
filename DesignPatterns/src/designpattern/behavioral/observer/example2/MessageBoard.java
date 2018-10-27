package designpattern.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class MessageBoard implements MySubject {
	
	private List<Student> studentsAsObservers = null;
	private String message;
	
	public MessageBoard() {
		super();
		studentsAsObservers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Student observer) {
		studentsAsObservers.add(observer);
	}
	
	@Override
	public void unregisterObserver(Student observer) {
		studentsAsObservers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		studentsAsObservers.forEach(observer -> observer.update(message));
	}

	/*public String getMessage() {
		return message;
	}*/

	public void setMessage(String message) {
		this.message = message;
		notifyObservers();
	}
}
